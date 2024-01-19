class Silvester(private var nameAnimal: String) {
    private var attack: Int = 0

    constructor(nameAnimal: String, attack: Int) : this(nameAnimal) {
        this.attack = attack
    }

    fun presentation() = println("My silvester animal is $nameAnimal and your attack value is $attack")
}

fun main() {
    val s1 = Silvester("Falcon")
    val s2 = Silvester("Snake", 1000)
    s1.presentation()
    s2.presentation()
}