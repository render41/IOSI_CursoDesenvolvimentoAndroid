// Classe limita comportamentos (podendo ser dado através dos métodos) e atributos (Caracteristicas dessa classe).
class PeopleTwo(val yearOfBirth: Int, var namePerson: String) {
    var age = 2023 - yearOfBirth
    fun salutation() {
        println("Welcome, ${this.namePerson}.")
    }
}

fun main() {
    println("Type your name:")
    val newName = readln()
    println("Type your year of birth:")
    val newYearOfBirth = readlnOrNull()?.toInt() ?: 0
    println("")
    val people = PeopleTwo(yearOfBirth = newYearOfBirth, namePerson = newName)
    println("Your year of birth is: ${people.yearOfBirth}.")
    println("Your age is: ${people.age} years.")
    people.salutation()
}