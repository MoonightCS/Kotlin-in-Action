@file:JvmName("SimplifyFunctions")

package ru.popov.bodya.functions

import ru.popov.bodya.strings.joinToStringWithDefaultValues
import ru.popov.bodya.strings.lastChar

const val UNIX_LINE_SEPARATOR = "\n"
var opCount = 0  // Объяление свойства верхнего уровня

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString("; ", "(", ")"))
    println(joinToStringWithDefaultValues(list, postfix = ";", prefix = "#"))

    val testString = "Kotlin".lastChar()
    println(testString)

}