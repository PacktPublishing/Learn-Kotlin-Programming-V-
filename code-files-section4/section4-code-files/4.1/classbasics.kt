package com.google.kotlin.section4

fun main(args: Array<String>) {

    // First Dog
    var dog1 = Dog()       // dog1 is reference variable and Dog() is an object
    dog1.breed = "German Shepherd"
    dog1.size = 40
    dog1.color = "Black"

    dog1.bark()
    dog1.run()

    println("My name is ${dog1.breed}, my size is ${dog1.size} and my color is ${dog1.color}")

    // Second Dog
    var dog2 = Dog()
    dog2.breed = "Pug"
    dog2.size = 10
    dog2.color = "Brown"

    dog2.bark()
    dog2.run()

    println("My name is ${dog2.breed}, my size is ${dog2.size} and my color is ${dog2.color}")
}

class Dog {

    var breed: String = ""      // Property
    var size: Int = -1          // Property
    var color: String = ""      // Property

    fun bark() {
        println(" Wooh ! Wooh !")
    }

    fun run() {
        println("I am running !")
    }
}
