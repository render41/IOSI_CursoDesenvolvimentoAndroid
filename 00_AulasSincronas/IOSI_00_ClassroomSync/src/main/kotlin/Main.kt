fun main() {
    println(plusValues(a = 20.0, b = 30.0))
    println(multiplyValues(a = 20.0, b = 30.0))
}

fun plusValues(a: Double, b: Double): Double = a + b
fun multiplyValues(a: Double, b: Double): Double = a * b