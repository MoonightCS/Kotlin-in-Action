package ru.popov.bodya.basic

data class Person(val name: String,
                  val age: Int? = null)

fun firstTry() {
    val persons = listOf(
            Person("Alice"),
            Person("Bob", age = 29)
    )
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

fun modernMax(a: Int, b: Int) : Int = if (a > b) a else b

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    val max = max(5, 7)
    println("result value: $max")
    val secondMax = modernMax(4, 3)
    println("result value: $secondMax")

    val bean = PersonBean("Bodya")
    println("PersonBean name is: ${bean.name}")

    val rec = Rectangle(1, 2)
    println(rec.isSquare)
}