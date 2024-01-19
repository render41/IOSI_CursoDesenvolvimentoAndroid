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

class Event(): Events {
    override fun ok() = println("Program is ok.")
}

fun main() {
    val program = Program()
    val event = Event()
    program.saveProgram(event)
}