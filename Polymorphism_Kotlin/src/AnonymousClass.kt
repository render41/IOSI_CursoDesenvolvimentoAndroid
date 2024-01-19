interface Events {
    fun ok() {

    }
}

class Program {
    fun saveProgram(e: Events) {
        println("Open Files")
        println("Saving values of files")
        println("Save connections.")
        e.ok()
    }
}

fun main() {
    val program = Program()
    program.saveProgram(object : Events {
        override fun ok() {
            println("Program is ok.")
        }
    })
}