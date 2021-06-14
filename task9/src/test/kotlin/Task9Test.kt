import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.BeforeTest
import kotlin.test.AfterTest


internal class Task9Test {
    private val standardOut = System.out
    private val standardIn = System.`in`
    private val stream = ByteArrayOutputStream()
    @BeforeTest
    fun setUp() {
        System.setOut(PrintStream(stream))
    }

    @AfterTest
    fun tearDown() {
        System.setOut(standardOut)
        System.setIn(standardIn)
    }

    @Test
    fun test1() {
        computeSum(arrayOf("1", "2", "3"))
        assertEquals("6", stream.toString().trim())
    }

    @Test
    fun test2() {
        System.setIn(ByteArrayInputStream("1 2 3".toByteArray()))
        computeSum(arrayOf())
        assertEquals("6", stream.toString().trim())
    }

}