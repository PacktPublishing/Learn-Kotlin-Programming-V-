
fun main(args: Array<String>) {

    // Let's explore data types in Kotlin
    var name: String = "Henry"
    name = "Kevin"

    println(name)

    var age: Int = 15
    var myAge = 20

    var newAge: Int
    newAge = 35

    println(age)

    var gender: Char = 'M'
    var isAlive: Boolean = false
    val marks: Float = 95.5F        // Immutable value

    var percentage: Double = 23.66667

    // "My name is Kevin and I secured 95.5 in Maths exam"
    println("My name is " + name + " and I secured " + marks + " in Maths exam")
}
