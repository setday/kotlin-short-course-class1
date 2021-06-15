import kotlin.math.PI

/**
 * возвращает наименьшее из трёх заданных чисел
 */
fun min3(a: Int, b: Int, c: Int): Int {
    return if (a < b) (if (a < c) a else c) else if (b < c) b else c
}

/*
Задача 3.1. Дано значение угла α в градусах. Определить значение этого же угла в радианах,
учитывая, что 180° = π радианов.

Задача 3.2. Дано значение угла α в радианах. Определить значение этого же угла в градусах,
учитывая, что 180° = π радианов.
 */

fun deg2rad(aDeg: Double): Double {
    return aDeg * PI / 180
}

fun rad2deg(aRad: Double): Double {
    return aRad * 180 / PI
}

fun main() {
    println(deg2rad(180.0))
    println(rad2deg(PI))
}