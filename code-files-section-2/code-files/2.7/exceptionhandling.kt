
fun main(args: Array<String>) {

    // WAP to divide two numbers

    try {
        val result = 8 / 2
        println("The result is $result")
    } catch (ex: Exception) {
        println("You cannot divide a number by Zero")
    } finally {
        println("Finally block is always executed")
    }
}