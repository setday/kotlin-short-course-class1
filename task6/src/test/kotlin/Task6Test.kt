import kotlin.test.Test
import kotlin.test.assertEquals

internal class Task6Test {
    @Test
    fun sumOfMatricesTest1() {
        val m1: Array<Array<Int>> = arrayOf(
            arrayOf(1,0,0),
            arrayOf(0,1,0),
            arrayOf(0,0,1)
        )
        val m2: Array<Array<Int>> = arrayOf(
            arrayOf(2,0,0),
            arrayOf(0,2,0),
            arrayOf(0,0,2)
        )
        assertEquals(m2, sumOfMatrices(m1, m1))
    }

}