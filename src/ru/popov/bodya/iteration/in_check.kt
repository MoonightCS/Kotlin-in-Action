package ru.popov.bodya.iteration

import ru.popov.bodya.examples.rec

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "Dunno :("
}
fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('q'))
    println(recognize('8'))
}