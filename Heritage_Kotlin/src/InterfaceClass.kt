interface CharacterMelee {
    fun attack() {
        println("O personagem está prestes a atacar")
    }
}

abstract class Character(nameCharacter: String): CharacterMelee {
    abstract fun wake()
    abstract fun talk()
    abstract fun eat()
}

class Warrior(nameWarrior: String): Character(nameWarrior) {
    override fun wake() {
        TODO("Not yet implemented")
    }

    override fun talk() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun attack() {
        println("Warrior is Attack!")
    }
}

fun main() {
    val warrior = Warrior("War")
    warrior.attack()
}