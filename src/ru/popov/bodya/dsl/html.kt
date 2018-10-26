package ru.popov.bodya.dsl

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString(): String = "<$name>${children.joinToString("")}</$name>"
}

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

fun createTable() =
        table {
            tr {
                td {

                }
            }
        }

fun createAnotherTable() = table {
    for (i in 1 until 3) {
        tr {
            td {

            }
        }
    }
}

fun main(args: Array<String>) {
    println(createTable())
    println(createAnotherTable())
}