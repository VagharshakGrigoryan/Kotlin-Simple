package topics

import java.util.*

fun main() {
    println(testSimple(3, 10))
    println(testString(10))
    println(testNamedArguments(y = 4, z = 5, x = 9))
    testDefaultArguments(y = 1)
    testDefaultArguments(3, 5)
    printEven(1, 2, 7, 8, 9, 10, 11, 22)
    println()
    println("PrintEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
}

fun testSimple(x: Int, y: Int): Int = x * y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number
}

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) print(e) }
}