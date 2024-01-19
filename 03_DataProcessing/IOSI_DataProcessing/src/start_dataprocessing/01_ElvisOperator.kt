package start_dataprocessing

fun main() {
    var str: String? = null
    if (str == null) {
        println("Null Variable")
    } else {
        println(str)
    }

    // Elvis Operator (Ternary Operator)
    println(str ?: "Is Null")
}