class Math() {
    // Scope Class
    companion object M {
        val PI = 3.14

        fun adc() {
            println("test adc")
        }
        object Calculates {
            val sum = PI + PI
            val sub = PI - 2
        }
    }
}

fun main() {
    println(Math.PI)
    println(Math.M.Calculates.sum)
    println(Math.M.Calculates.sub)
}