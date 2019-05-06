package com.google.kotlin.section4

fun main(args: Array<String>) {

    var user1 = User("Sam", 1)
    var user2 = User("Sam", 1)

    println(user1)
    println(user2)

    if (user1 == user2)
        println("Both users are equal")
    else
        print("Both users are different")
}

data class User(var name: String, var id: Int) {

}
