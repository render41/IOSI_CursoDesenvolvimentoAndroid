fun main() {
    val rows = 3
    val columns = 3

    val matrix = Array(rows) { Array(columns) { 0 } }
    var valueMatrix = -1

    for (i in 0..<rows) {
        for (j in 0..<columns) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    for (i in 0..<rows) {
        for (j in 0..<columns) {
            matrix[i][j] = valueMatrix++
            print("${matrix[i][j]} ")
        }
        println()
    }
}