data class Pupil(val firstName: String, val lastName: String, var age: Int)

fun demoPupils() {
    val pupils = listOf(
        Pupil("Мария", "Петрова", 14),
        Pupil("Иван", "Иванов", 15),
        Pupil("Дмитрий", "Сидоров", 16),
    )

    println("\nПечать всех школьников")
    println(pupils)

    // Увеличение возрастов на единицу
    for(p in pupils) {
        p.age += 1
    }

    println("\nПечать всех школьников (по одному в строке)")
    pupils.forEach {
        println(it)
    }

    println("\nПечать всех школьников (в собственном формате)")
    pupils.forEach {
        println("${it.lastName} ${it.firstName[0]}. (${it.age})")
    }


    println("\nПечать всех школьников старше 15 лет")
    pupils.filter {
        it.age > 15
    }.forEach {
        println(it)
    }

    println("\nПечать всех школьников, упорядоченных по возрастам")
    pupils.sortedBy {
        it.age
    }.forEach {
        println(it)
    }

}