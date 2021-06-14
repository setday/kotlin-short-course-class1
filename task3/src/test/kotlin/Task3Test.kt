import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test
    fun deg2RadTest1() {
        assertEquals(PI, deg2rad(180.0), 1e-5)
        assertEquals(PI, deg2rad(2*360 + 180.0), 1e-5)
    }

    @Test
    fun rad2DegTest1() {
        TODO()
    }

    @Test
    fun moreTests() {
        TODO("Напишите для каждой функции по 5 тестов, проверяющих разные случаи")
    }
}