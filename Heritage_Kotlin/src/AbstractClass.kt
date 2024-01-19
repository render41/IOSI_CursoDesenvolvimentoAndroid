// Usada somente para herdar outras classes.
abstract class Mammal(val nameAnimal: String) {
    abstract fun wake()
    abstract fun talk()
    abstract fun eat()
}

class Dog(nameAnimal: String): Mammal(nameAnimal) {
    override fun eat() {
        println("$nameAnimal is eating.")
    }

    override fun talk() {
        println("$nameAnimal is talking.")
    }

    override fun wake() {
        println("$nameAnimal is waking.")
    }
}


fun main() {
    val animal: Dog = Dog("Bolt")
    animal.eat()
}