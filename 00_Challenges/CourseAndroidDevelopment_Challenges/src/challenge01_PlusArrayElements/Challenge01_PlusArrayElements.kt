package challenge01_PlusArrayElements

fun main() {
    val sumResult: Int = plusArrays(intArrayOf(1, 2, 3, 2))
    print("The sum result is: $sumResult")
}

fun plusArrays(arrays: IntArray): Int = arrays.sum()