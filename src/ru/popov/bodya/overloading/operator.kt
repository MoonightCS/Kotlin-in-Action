package ru.popov.bodya.overloading

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

private operator fun Point.times(other: Point) = Point(x * other.x, y * other.y)
private operator fun Point.div(other: Point) = Point(x / other.x, y / other.y)
private operator fun Point.rem(other: Point) = Point(x % other.x, y % other.y)
private operator fun Point.minus(other: Point) = Point(x - other.x, y - other.y)
private operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())
private operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}
private operator fun Point.unaryMinus() = Point(-x, -y)
private operator fun Point.get(index: Int) = when (index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

private operator fun <T> MutableCollection<T>.plus(element: T): MutableCollection<T> {
    this.add(element)
    return this;
}

data class MutablePoint(var x: Int, var y: Int)
private operator fun MutablePoint.set(index: Int, value: Int) = when(index) {
    0 -> x = value
    1 -> y = value
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 / p2)
    println(p1 % p2)
    println(p1 - p2)
    println(p1 * 3.0)
    println(-p1)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers)

    val pp = Point(10, 20)
    println(pp[1])

    val mutablePoint = MutablePoint(10, 20)
    mutablePoint[1] = 42
    println(mutablePoint)
}