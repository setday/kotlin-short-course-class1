import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

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

        val resm: Array<Array<Int>> = sumOfMatrices(m1, m1);

        for(row in m2.indices)
            for (col in m2.indices)
                assert(resm[row][col] == m2[row][col])
    }

}