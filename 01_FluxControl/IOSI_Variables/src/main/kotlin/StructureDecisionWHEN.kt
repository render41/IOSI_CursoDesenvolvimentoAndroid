fun main() {
    val vacation: String = "Programador"
    when(vacation) {
        "Presidente" -> println(5000)
        "Gerente" -> println(4000)
        "Programador" -> println(12000)
        else -> println("Cargo não especificado")
    }
}