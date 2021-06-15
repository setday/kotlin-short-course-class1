/*
В этом упражнении следует реализовать кодирование и декодирование сообщений с помощью азбуки Морзе.
Мы будем кодировать слова, содержащие только строчные латинские буквы, и для простоты будем считать,
что коды Морзе разделяются в закодированном сообщении пробелами.

Полезные функции:
* mutableListOf<String>() - создаёт пустой список строк, к которому можно добавлять методом add новые элементы
* joinToString(" ") - метод списка, который собирает все элементы в строку, разделяя их заданной подстрокой
* split(" ") - метод строки, который разбивает её на массив подстрок по заданному разделителю

 */

const val aC: String = "abcdefghijklmnopqrstuvwxyz"
val mC = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
    ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
    "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

fun code(message: String): String {
    var ind = -1
    var res = ""
    for (c in message) { if (c in aC) { res += mC[aC.indexOf(c)] + " " } }
    return res.slice(0..res.length - 2)
}

fun decode(message: String): String {
    var ind = -1
    var res = ""
    for (c in message.split(" ")) { if (c in mC) { res += aC[mC.indexOf(c)]} }
    return res
}

fun main() {
    val message = "hello world"
    val codedMessage = code(message)
    println(codedMessage)
    println(decode(codedMessage))
}