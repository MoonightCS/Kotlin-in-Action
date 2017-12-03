package ru.popov.bodya.examples

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Sub(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            is Sub -> eval(e.left) - eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            is Sub -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sub: $left - $right")
                left - right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }


fun main(args: Array<String>) {
    println(eval(Sum(Num(5), Num(3))))
    println(evalWithLogging(Sum(Num(5), Num(3))))
    println(eval(Sub(Num(5), Num(3))))
}