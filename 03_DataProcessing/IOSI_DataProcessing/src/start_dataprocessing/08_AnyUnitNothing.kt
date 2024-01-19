package start_dataprocessing

import java.math.BigDecimal

fun main() {
    anyType(10)
    unitType()
    nothingType()
}

fun anyType(value: Any) {
    // Any: Significa qualquer, ou seja, representa qualquer tipo de variável
    println("Printing the value: $value")
}

fun unitType(): Unit {
    // Unit: é o mesmo que determinar um função com o tipo void.
    // Retorna não um valor mas o seu processo.
    println("Function without return.")
}

fun nothingType(): Nothing {
    // Nothing: Entende-se como uma função com retorno com tratamento de excessão.
    TODO ("Function yet to be completed.")
    val text = readLine()?.toFloat() ?: 0.0f
}