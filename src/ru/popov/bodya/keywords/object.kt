package ru.popov.bodya.keywords

data class Person(val name: String, val salary: Int)

object Payroll {
    val allEmployees = arrayListOf(Person("Bodya", 250), Person("Maryana", 240))

    fun calculateSalary(): Int {
        var allSum = 0
        allEmployees.forEach { allSum += it.salary }
        return allSum;
    }
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Katya", 230))
    println(Payroll.calculateSalary())
}