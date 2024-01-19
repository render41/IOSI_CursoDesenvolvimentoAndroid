package start_dataprocessing

import java.util.Scanner

fun readInt() {
    val scanner = Scanner(System.`in`)
    println("Write a value int type: ")
    val num = scanner.nextInt()
    println("You write: $num")
    scanner.close()
}

fun readDouble() {
    val scanner = Scanner(System.`in`)
    println("Write a value double type: ")
    val num = scanner.nextDouble()
    println("You write: $num")
    scanner.close()
}

fun main() {
    readInt()
    readDouble()
}