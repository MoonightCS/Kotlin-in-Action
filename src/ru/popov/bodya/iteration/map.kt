package ru.popov.bodya.iteration

import java.util.*

fun symbolsInit() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun saveAndShowIndex() {
    val list = arrayListOf("10", "11", "12")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun main(args: Array<String>) {
    symbolsInit()
    saveAndShowIndex()
}