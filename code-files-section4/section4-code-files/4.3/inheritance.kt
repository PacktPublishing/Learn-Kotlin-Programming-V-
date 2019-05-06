package com.google.kotlin.section4

fun main(args: Array<String>) {

    var dog = MyDog()
    dog.breed = "Pug"
    dog.color = "Brown"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 10
    cat.color = "white"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "Black"
    animal.eat()

}

open class Animal { // Parent class or Super class

    var color: String = ""

    fun eat() {
        println("I am eating !")
    }
}

class MyDog: Animal() {  // Child class or Sub class

    var breed: String = ""

    fun bark() {
        println("Wooh ! Wooh !")
    }
}

class Cat: Animal() {   // Child class or Sub class

    var age: Int = -1

    fun meow() {
        println("Meow ! Meow !")
    }
}
