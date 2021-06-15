import kotlin.test.Test
import kotlin.test.assertEquals

internal class Task5Test {

    @Test
    fun lastLocalMaxIndTest1() {
        assertEquals(5, lastLocalMaxInd(listOf(0,4,20,6,3,8,5,3)))
    }

    @Test
    fun lastLocalMaxIndTest2() {
        assertEquals(-1, lastLocalMaxInd(listOf(0)))
    }

    @Test
    fun lastLocalMaxIndTest3() {
        assertEquals(-1, lastLocalMaxInd(listOf()))
    }

    @Test
    fun lastLocalMaxIndTest4() {
        assertEquals(6, lastLocalMaxInd(listOf(1, -10, 5, 6, 0, -10, 1, -5)))
    }

}