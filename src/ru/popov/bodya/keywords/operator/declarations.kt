package ru.popov.bodya.keywords.operator

private data class NameComponents(val name: String, val extension: String)

private fun splitFilename(fullName: String) : NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun main(args: Array<String>) {
    val (name, extension) = splitFilename("example.kt")
    println(name)
    println(extension)
}