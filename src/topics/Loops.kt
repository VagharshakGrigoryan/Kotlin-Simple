package topics

fun main() {
    //for each
    val items = listOf("apple", "banana", "orange") //list.of Java 9 չթոփոխվող է
    // mutableListOf("apple","banana","orange") //ArrayList

    for (item in items)
        println(item)

    //while
    var index = 0;
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    //Диапазон (как в Python)
    print(5 in 3..10)//true
    println()
    for (i in 1..10)
        print(i)
    println()
    for (i in 1 until 10)
        print(i)
    println()
    for (i in 10 downTo 1)
        print(i)
    println()
    for (i in 0..100 step 10)
        print(i)
    println()

}

