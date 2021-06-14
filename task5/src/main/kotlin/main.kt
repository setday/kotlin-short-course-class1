/*
Найти индекс последнего локального максимума в списке.
Локальный максимум — это элемент, который больше любого из своих соседей.
Элементы индексируются с нуля.

Подсказка. Цикл for: печатаем все элементы коллекции numbers, кроме первого и последнего

    val numbers = listOf(1,2,3)
    for(idx in 1..numbers.lastIndex - 1)
        println(numbers[idx])
 */

fun lastLocalMaxInd(numbers: Collection<Int>): Int {
    TODO()
}

fun main(args: Array<String>) {
    println(lastLocalMaxInd(listOf(0,4,2,6,3,8,5,3)))
}