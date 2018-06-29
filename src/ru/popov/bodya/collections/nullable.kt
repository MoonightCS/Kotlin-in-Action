package ru.popov.bodya.collections

import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}

private fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0;
    var invalidNumbers = 0;
    for (number in numbers) {
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

private fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = arrayListOf<Int?>()
    for (line in reader.lineSequence()) {
        result.add(line.toIntOrNull())
    }
    return result
}

private fun String.toIntOrNull(): Int? = try {
    this.toInt()
} catch (e: NumberFormatException) {
    null
}