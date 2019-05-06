

fun main(args: Array<String>) {

    // First Dog
    var dog1 = Dog("German Shepherd", 40,"Black")       // dog1 is reference variable and Dog() is an object

    dog1.bark()
    dog1.run()

    // Second Dog
    var dog2 = Dog("Pug", 10, "Brown")

    dog2.bark()
    dog2.run()
}

class Dog(var breed: String, var size: Int, var color: String) {

    init {
        println("My name is ${this.breed}, my size is ${this.size} and my color is ${this.color}")
    }

    fun bark() {
        println(" Wooh ! Wooh !")
    }

    fun run() {
        println("I am running !")
    }
}
