package ru.popov.bodya.basic

import ru.popov.bodya.basic.Color.*

fun main(args: Array<String>) {
    println(BLUE.rgb())
    println(getMnemonic(BLUE))
    println(getWarmth(GREEN))
    println(mix(BLUE, YELLOW))
}

fun getMnemonic(color: Color) =
        when (color) {
            RED -> "Каждый"
            ORANGE -> "Охотник"
            YELLOW -> "Желает"
            GREEN -> "Знать"
            BLUE -> "Где"
            INDIGO -> "Сидит"
            VIOLET -> "Фазан"
        }

fun getWarmth(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "теплый"
            GREEN -> "нейтральный"
            BLUE, INDIGO, VIOLET -> "холодный"
        }

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Грязный цвет")
        }