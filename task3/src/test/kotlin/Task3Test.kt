import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test
    fun deg2RadTest1() {
        assertEquals(PI, deg2rad(180.0), 1e-5)
    }

    @Test
    fun deg2RadTest2() {
        assertEquals(5 * PI, deg2rad(2*360 + 180.0), 1e-5)
    }

    @Test
    fun deg2RadTest3() {
        assertEquals(1.5 * PI, deg2rad(270.0), 1e-5)
    }

    @Test
    fun deg2RadTest4() {
        assertEquals(-1.5 * PI, deg2rad(-270.0), 1e-5)
    }

    @Test
    fun rad2DegTest1() {
        assertEquals(180.0, rad2deg(PI), 1e-5)
    }

    @Test
    fun rad2DegTest2() {
        assertEquals(540.0, rad2deg(2 * PI + PI), 1e-5)
    }

    @Test
    fun rad2DegTest3() {
        assertEquals(270.0, rad2deg( 1.5 * PI), 1e-5)
    }

    @Test
    fun rad2DegTest4() {
        assertEquals(-270.0, rad2deg( -1.5 * PI), 1e-5)
    }
}