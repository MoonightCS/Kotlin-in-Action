package ru.popov.bodya.collections

infix fun Int.to(other: String) = Pair(this, other)

fun main(args: Array<String>) {
    val map: Map<Int, String> = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)
}