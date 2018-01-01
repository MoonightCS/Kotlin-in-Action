@file:JvmName("StringFunctions")

package ru.popov.bodya.strings

import ru.popov.bodya.functions.joinToString

/**
 * Пример функции с дефолтными значениями
 */
fun <T> joinToStringWithDefaultValues(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * Пример функции-расширения
 * String = Тип-получатель (тип, для которого определяется расширение)
 * this = объект-получатель (экземпляр данного типа)
 * К методам объекта получателя можно обращаться без this
 */
fun String.lastChar(): Char = this.get(this.length - 1)


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString("; ", "(", ")"))
    println(list.joinToString(postfix = ";", prefix = "#"))
}