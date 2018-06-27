package ru.popov.bodya.keywords

sealed class Expr

class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
        }

fun main(args: Array<String>) {
    println(eval(Sum(Num(3), Num(4))))
}