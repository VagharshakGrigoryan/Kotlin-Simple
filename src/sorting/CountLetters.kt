package sorting

fun main() {
    println(countLetters("AAAABBBCCXXDDDDEEEFFFAAAAAABBBBBBBBBBBBBB"))
}

fun countLetters(str: String): String {
    var currentLatter = str[0]
    var count = 1
    var result = ""

    for (latter in str.substring(1)) {
        if (currentLatter == latter) {
            count++
        } else {
            if (count == 1)
                result += currentLatter
            else
                result += "$currentLatter$count"
            count = 1
            currentLatter = latter
        }
    }

    if (count == 1)
        result += currentLatter
    else
        result += "$currentLatter$count"
    return result
}