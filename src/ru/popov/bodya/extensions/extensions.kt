package ru.popov.bodya.extensions

/**
 * В Kotlin допускается переопределять функции-члены, но нельзя переопределить функцию-расширение
 */

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button")

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()

    val button: Button = Button();
    button.click()
    button.showOff()
}