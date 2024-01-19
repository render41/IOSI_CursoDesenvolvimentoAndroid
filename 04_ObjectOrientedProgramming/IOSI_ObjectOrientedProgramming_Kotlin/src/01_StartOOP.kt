// Classe limita comportamentos (podendo ser dado através dos métodos) e atributos (Caracteristicas dessa classe).
class People(val yearOfBirth: Int, var namePerson: String) {
    var age = 2023 - yearOfBirth
    fun salutation() {
        println("Welcome ${this.namePerson}.")
    }
}

fun main() {
    val people: People = People(yearOfBirth = 1997, namePerson = "Gabriel")
    println("Your year of birth is: ${people.yearOfBirth}.")
    println("Your age is: ${people.age} years.")
    people.salutation()
}
