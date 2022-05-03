package topics

fun main() {
    var a: String = "Hello"
    a.length
    var b: String? = "Test"
    b = null
//    b.length
    b?.length

    //elvis operator
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "abcd" else null
    //!! -trow NPE if variable is null
    val t = b!!.length

}