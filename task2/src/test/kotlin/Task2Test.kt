import kotlin.test.Test
import kotlin.test.assertEquals

class Task2Test {
    @Test
    fun min3Test1() {
        assertEquals(0, min3(2, 0, 3))
    }

    @Test
    fun min3Test2() {
        assertEquals(2, min3(2, 2, 2))
    }

    @Test
    fun min3Test3() {
        assertEquals(-10, min3(-10, 5, 0))
    }

    @Test
    fun min3Test4() {
        assertEquals(-15, min3(-10, -15, -10))
    }

    @Test
    fun min3Test5() {
        assertEquals(-10, min3(5, -10, 0))
    }

    @Test
    fun min3Test6() {
        assertEquals(-10, min3(0, 5, -10))
    }

}