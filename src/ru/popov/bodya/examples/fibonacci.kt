package ru.popov.bodya.examples

fun fibonacci(size: Int) = iter(0, 1, size)
fun recFibo(size: Int) = rec(size)

fun iter(first: Int, second: Int, size: Int): Int =
        when (size) {
            0 -> first
            else -> iter(second, first + second, size - 1)
        }

fun rec(size: Int): Int =
        when (size) {
            0 -> 0
            1 -> 1
            else -> rec(size - 1) + rec(size - 2)
        }


fun main(args: Array<String>) {
    println(fibonacci(25))
    println(recFibo(25))
}