/*
Напечатайте рамку размера width x height, состоящую из символов frameChar.
Можно считать, что width>=2, height>=2
Например, вызов printFrame(5,3,'+') должен напечатать следующее:

+++++
+   +
+++++

В решении удобно воспользоваться циклом repeat. Например, следующий код печатает числа от 1 до 10:

    repeat(10) {
        println(it + 1)
    }

 */

fun printFrame(width: Int, height: Int, frameChar: Char = '*') {
    repeat(width) { print(frameChar) }; println()
    repeat(height - 2) { print(frameChar); repeat(width - 2) { print(" ") }; println(frameChar) }
    repeat(width) { print(frameChar) }; println()
}

fun main() {
    printFrame(5,3,'+')
}