package ru.popov.bodya.iteration

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun commonIteration() {
    val list = arrayListOf("10", "11", "12")
    for (element in list) {
        println("element: $element")
    }
}

fun iterationInRange() {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    println()
}

fun reverseIterationInRange() {
    for (i in 100 downTo 1) {
        print(fizzBuzz(i))
    }
    println()
}

fun reverseIterationInRangeWithStep() {
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    println()
}

fun main(args: Array<String>) {
    commonIteration()
    iterationInRange()
    reverseIterationInRange()
    reverseIterationInRangeWithStep()
}