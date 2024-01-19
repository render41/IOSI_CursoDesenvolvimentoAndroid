open class Electronic(private val brand: String) {
    fun turnOnElectronic() {
        println("Turn On Electronic: $brand")
    }

    fun turnOffElectronic() {
        println("Turn On Electronic: $brand")
    }
}

private class Computer(private val brand: String): Electronic(brand) {
    fun installSoftware() {
        println("Install software's in: $brand")
    }
}

fun main() {
    val computer = Computer("Dell")
    computer.turnOnElectronic()
    computer.installSoftware()
    computer.turnOffElectronic()
}