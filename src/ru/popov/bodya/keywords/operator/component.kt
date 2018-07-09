package ru.popov.bodya.keywords.operator

private data class NameComponents(val name: String, val extension: String)
private class PointWithComponent(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

private fun splitFilename(fullName: String) : NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

private fun splitWithExactSize(fullName: String) : NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main(args: Array<String>) {
    val (name, extension) = splitFilename("example.kt")
    println(name)
    println(extension)

    val (x, y) = PointWithComponent(1, 2)
    println("$x and $y")

    println(splitWithExactSize("example.kt"))
}