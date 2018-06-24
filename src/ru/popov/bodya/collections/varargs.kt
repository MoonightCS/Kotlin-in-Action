package ru.popov.bodya.collections

fun printList(args: Array<String>) {
    val list = listOf("args", *args)
    println(list)
}

fun main(args: Array<String>) {
    printList(arrayOf("bodya", "maryana"))
}