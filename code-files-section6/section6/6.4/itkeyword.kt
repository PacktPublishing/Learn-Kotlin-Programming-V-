package com.google.kotlin.section6

fun main(args: Array<String>) {

    // WAP to reverse a string and print it "hello"  "olleh"

    reverseAndDisplay("Hello", { str -> str.reversed() })
    reverseAndDisplay("Hello", { it.reversed() })   // { str -> str.reversed() }
    reverseAndDisplay("Hello") { it.reversed() }    // Same .. as above
}

fun reverseAndDisplay(str: String, myFunc: (String) -> String) {

    val result = myFunc(str)    // str.reversed() ==> "Hello".reversed() ==> "olleH"
    println(result)
}
