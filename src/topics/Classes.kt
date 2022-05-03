package topics

fun main() {
    val child = Person("child", "child", 2)
    val p1 = Person("name", "surname", 31)

    print(p1.firstName)
    println()

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) //true
}

//Primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    private var children: MutableList<Person> = mutableListOf() //ArrayList

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    //constructor without arguments
    constructor() : this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //this in java
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}