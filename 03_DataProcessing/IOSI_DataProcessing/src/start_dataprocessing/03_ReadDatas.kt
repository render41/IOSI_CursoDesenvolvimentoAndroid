package start_dataprocessing

fun main() {
    print("Digite um valor para Inteiros: ")
    val sInt = readlnOrNull()?.toInt() ?: 0
    print("Digite um valor para Reais: ")
    val sDouble = readlnOrNull()?.toDouble() ?: 0.0
    print("Digite um valor para Booleanos: ")
    val sBoolean = readlnOrNull()?.toBoolean() ?: false

    println("Dado escrito na variável sInt: $sInt")
    println("Dado escrito na variável sDouble: $sDouble")
    println("Dado escrito na variável sBoolean: $sBoolean")
}