package topics

fun main() {
    testWhen(1)
    testWhen("hello")
    testWhen(15)
}

//testWhen(Object object) in java
fun testWhen(input: Any) {
    when (input) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("tree")
        in 10..20 -> println("from 10 to 20")
        is String -> println("String ${input.length}")
        else -> println("something")
    }
}