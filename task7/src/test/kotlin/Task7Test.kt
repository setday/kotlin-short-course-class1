import kotlin.test.Test
import kotlin.test.assertEquals

internal class Task7Test {

    @Test
    fun testCode() {
        assertEquals(".... . .-.. .-.. ---", code("hello"))
    }

    @Test
    fun testCodeDecode() {
        val message = "pneumonoultramicroscopicsilicovolcanoconiosis"
        assertEquals(message, decode(code(message)))
    }

}