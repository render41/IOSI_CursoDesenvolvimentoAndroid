package start_dataprocessing

fun main() {
    var str: String? = null
    str = "Gabriel"
    if (str != null) {
        println("In If")
    }

    str?.let {
        println(str)
    }
}