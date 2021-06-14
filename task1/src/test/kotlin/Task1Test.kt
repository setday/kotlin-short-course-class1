import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.BeforeTest
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Task1Test {
    private val standardOut = System.out
    private val stream = ByteArrayOutputStream()

    @BeforeTest
    fun setUp() {
        System.setOut(PrintStream(stream))
    }

    @AfterTest
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun testSayHello() {
        sayHello("Vitaly")
        assertEquals("Hello Vitaly!", stream.toString().trim())
    }

    @Test
    fun testSayHelloNL() {
        sayHello("Vitaly\nBragilevsky")
        assertEquals("Hello Vitaly\nBragilevsky!", stream.toString().trim())
    }

}