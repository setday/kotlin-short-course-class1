/*
Найти индекс последнего локального максимума в списке.
Локальный максимум — это элемент, который больше любого из своих соседей.
Элементы индексируются с нуля.

Подсказка. Цикл for: печатаем все элементы коллекции numbers, кроме первого и последнего

    val numbers = listOf(1,2,3)
    for(idx in 1..numbers.lastIndex - 1)
        println(numbers[idx])
 */

fun lastLocalMaxInd(numbers: List<Int>): Int {
    var a = -1

    if (numbers.size < 2) { return a }

    if (numbers[1] < numbers[0]) {a = 0}
    for (ind in 1 until numbers.lastIndex)
        if (numbers[ind - 1] < numbers[ind] && numbers[ind + 1] < numbers[ind]) {a = ind}
    if (numbers[numbers.lastIndex - 1] < numbers[numbers.lastIndex]) {a = numbers.lastIndex}

    return a
}

fun main(args: Array<String>) {
    println(lastLocalMaxInd(listOf(0,4,2,6,3,8,5,3)))
    }