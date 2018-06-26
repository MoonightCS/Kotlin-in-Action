package ru.popov.bodya.properties

class Classroom(val name: String)

class Student(val age: Int) {

    val isAdult: Boolean
        get() = age >= 18
    var name: String = "Maryana"
    var stringRepresentation: String = ""
        get() = field + "Popov"
        set(value) {
            field = value
            name = field
        }
    lateinit var classroom: Classroom
}

fun main(args: Array<String>) {
    val student = Student(18)
    student.stringRepresentation = "Bodya"
    println(student.name)
    println(student.stringRepresentation)
    println(student.isAdult)

    //  kotlin.UninitializedPropertyAccessException: lateinit property classroom has not been initialized
    student.classroom = Classroom("Alpha")
    print(student.classroom.name)

}