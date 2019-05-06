
fun main(args: Array<String>) {

    // Let's explore String Templates and Interpolation
    var name: String = "Henry"
    name = "Kevin"

    val marks: Float = 95.5F        // Immutable value

    // "My name is Kevin and I secured 95.5 in Maths exam"
    println("My name is " + name + " and I secured " + marks + " in Maths exam")	// Traditional Approach
    println("My name is $name and I secured $marks in Maths exam")					// String Interpolation


    // WAP to find out the length of String
    var str = "I am having fun !"
    println("The length of the String is ${str.length}")

    // WAP to find out the area of the rectangle
    var length = 10
    var breadth = 5
    println("The length is $length and breadth is $breadth, hence the area is ${length * breadth}")
}
