package ru.popov.bodya.exceptions

fun firstTry(percentage: Short) {
    if (percentage !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
    }
}

fun expression(number: Short): Short {
    return if (number in 0..100) {
        number
    } else {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
    }
}

fun main(args: Array<String>) {
    firstTry(100)
    println(expression(13))
}