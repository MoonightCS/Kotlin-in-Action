package ru.popov.bodya.keywords

import java.io.File

data class Person(val name: String, val salary: Int)

object Payroll {
    val allEmployees = arrayListOf(Person("Bodya", 250), Person("Maryana", 240))

    fun calculateSalary(): Int {
        var allSum = 0
        allEmployees.forEach { allSum += it.salary }
        return allSum;
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File) = file1.path.compareTo(file2.path, ignoreCase = true)
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Katya", 230))
    println(Payroll.calculateSalary())
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
}