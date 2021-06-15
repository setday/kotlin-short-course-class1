/**
 * возвращает наименьшее из трёх заданных чисел
 */
fun min3(a: Int, b: Int, c: Int): Int {
    return if (a < b) (if (a < c) a else c) else if (b < c) b else c
}

fun main() {
    println(min3(2, 0, 3))
}