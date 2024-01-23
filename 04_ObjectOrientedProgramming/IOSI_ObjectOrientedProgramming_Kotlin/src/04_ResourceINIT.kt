class Animal(species: String) {
    private var speak: String = ""

    init {
        this.speak = if (species.lowercase() == "dog") {
            "auau"
        } else if (species.lowercase() == "cat") {
            "miaumiau"
        } else {
            ""
        }

        println(this.speak)
    }

    fun speaker() {
        println(this.speak)
    }
}

fun main() {
    val animal = Animal("Dog")
}