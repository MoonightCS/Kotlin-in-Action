package ru.popov.bodya.basic

class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean get() = height == width

}

class PersonBean(val name: String)