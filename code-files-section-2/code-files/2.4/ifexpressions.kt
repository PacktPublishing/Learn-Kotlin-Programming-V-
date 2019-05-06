
fun main(args: Array<String>) {

    // Conditional IF ELSE statement . WAP to find our larger number.

    val a = 2
    val b = 5

    var greaterNum:Int

    if ( a > b ) {
        println("a is greater")
        greaterNum = a
    } else {   // b > a
        println("b is greater")
        greaterNum = b
    }

    println("The greater number finally is $greaterNum")

    // using IF expression
    var bigNum: Int = if ( a > b ) {
                        println("a is greater")
                        a
                    } else {   // b > a
                        println("b is greater")
                        b
                    }

    println("The greater number finally is $bigNum")

}