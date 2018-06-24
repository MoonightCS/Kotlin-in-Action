package ru.popov.bodya.trykotlin

import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt


fun start(): String = "OK"

fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) = (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
fun getPattern(): String = """\d{2} ${month} \d{4}"""


data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun getFunPeople() = listOf(Person("Alice", 29), Person("Bob", 31))

fun main(args: Array<String>) {
    println(getPeople())
    println(getFunPeople())
    println(listOf(1, 2, 3, 4, 5).fold(0, { acc, i -> acc + i }))
}