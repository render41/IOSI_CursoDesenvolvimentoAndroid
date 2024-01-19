fun main() {
    vectorInt()
    vectorFloat()
    vectorChar()
}

fun vectorInt() {
    var numbers = intArrayOf(0, 1, 2, 3, 4, 5)
    print("Numbers Int: ")
    for (i in numbers) {
        print("$i ")
    }
    println("\n")
}

fun vectorFloat() {
    var numbersFloat = floatArrayOf(3.2f, 312.5f, 45.12312f)
    print("Numbers Float: ")
    for (i in numbersFloat) {
        print("$i ")
    }
    println("\n")
}

fun vectorChar() {
    var charsVector = charArrayOf('a', 'b')
    for (i in charsVector) {
        print("$i ")
    }
}