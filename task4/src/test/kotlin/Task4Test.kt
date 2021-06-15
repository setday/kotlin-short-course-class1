import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.BeforeTest
import kotlin.test.AfterTest

internal class Task4Test {
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
    fun testPrintFrame1() {
        printFrame(5,3,'+')
        assertEquals("""
            +++++
            +   +
            +++++
        """.trimIndent(), stream.toString().trimIndent())
    }

    @Test
    fun testPrintFrame2() {
        printFrame(5,3,'-')
        assertEquals("""
            -----
            -   -
            -----
        """.trimIndent(), stream.toString().trimIndent())
    }

    @Test
    fun testPrintFrame3() {
        printFrame(2,2,'-')
        assertEquals("""
            --
            --
        """.trimIndent(), stream.toString().trimIndent())
    }

    @Test
    fun testPrintFrame4() {
        printFrame(3,5,'=')
        assertEquals("""
            ===
            = =
            = =
            = =
            ===
        """.trimIndent(), stream.toString().trimIndent())
    }

}