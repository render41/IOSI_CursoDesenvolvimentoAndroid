package start_dataprocessing

import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() = readFiles()

fun readFiles() {
    val file = File("D:\\Projects\\Estudos\\Cursos\\IOSI_CursoDesenvolvimentoAndroid\\03_DataProcessing\\IOSI_DataProcessing\\src\\start_dataprocessing\\07_steps.txt")
    try {
        Scanner(file).use {read ->
            while (read.hasNext()) println(read.next())
            read.close()
        }
    } catch (e: FileNotFoundException) {
        println("Failed to read file.")
        e.printStackTrace()
    }
}