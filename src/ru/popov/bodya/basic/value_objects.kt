package ru.popov.bodya.basic

class Rectangle(private val height: Int, private val width: Int) {

    val isSquare: Boolean get() = height == width

}

class PersonBean(val name: String)