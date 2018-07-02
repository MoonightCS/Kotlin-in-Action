package ru.popov.bodya.collections

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c")
    println("%s %s %s".format(*strings.toTypedArray()))
    strings.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }

}