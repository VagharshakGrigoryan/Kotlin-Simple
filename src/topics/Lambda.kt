package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 6, 5)
    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e -> sum + e })

    println(a.sorted())
    println(a.sortedDescending())

    println(a.any { it > 10 })

    println(a.all { it < 10 })
    println(a.sum())

    val numbers = listOf(1, -2, 3, 4, -44)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    val result = listOf("a", "b", "cd", "ad", "ccc","lolly").groupBy { it.length }
    println(result) //Hash map or LinkedHashMap
}