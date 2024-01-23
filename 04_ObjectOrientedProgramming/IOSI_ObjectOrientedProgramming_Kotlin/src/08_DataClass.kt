fun main() {
    val rectangle = RectangleData(10, 20)
    val rectangle2 = RectangleData(10, 20)
    println(rectangle.equals(rectangle2))
    rectangle.toString()
}

class Rectangle(var a: Int, var b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Rectangle) (other.a == this.a && other.b == this.b) else false
    }
}

// Simplifica comparação de dados
data class RectangleData(var a: Int, var b: Int) {

}