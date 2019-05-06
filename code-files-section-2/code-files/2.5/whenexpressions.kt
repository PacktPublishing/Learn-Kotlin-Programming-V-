
fun main(args: Array<String>) {

    // 1. Conditional When statement
    // 2. Ranges in Kotlin
    // 3. When Expressions

    val x = 100

    var str:String = when (x) {

        1 -> "x is 1"
        2 -> "x is 2"
        in 5..10 -> "x lies between 5 and 10"
        else -> {
            "x is an alien"
        }
    }

    println(str)
}