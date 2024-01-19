package start_dataprocessing

import kotlin.math.sqrt

fun main() {
    firstError()
}

fun firstError() {
    try {
        val s1: String? = null
        // s1 = "Felipe"
        println("String length: ${s1!!.length}")

        val a = 10 / 0
        println("Result is: $a")

        val b = -9.0
        val c = sqrt(b)
        println("Result is: $c")
        if (b < 0) throw IllegalArgumentException()

        val x = 1
        if (x == 1) throw Exception()

    } catch (e: NullPointerException) {
        println("The variable is empty")
    } catch (e: ArithmeticException) {
        println("There's no division by zero.")
    } catch (e: IllegalArgumentException) {
        println("There's no real root of negative number.")
    } catch (e: Exception) {
        println("Exception general.")
        println(e.message)
    } finally {
        println("Execution finally.")
    }
}