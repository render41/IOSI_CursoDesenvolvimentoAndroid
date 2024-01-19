open class Electronics(var brand: String) {
    private fun electricCurrent(activate: Boolean) {
        println("this electronic activate is: $activate")
    }

    open fun on() {
        electricCurrent(true)
    }

    open fun off() {
        electricCurrent(false)
    }
}

class PC(brand: String): Electronics(brand) {
    private fun save() {
        println("Save Option")
    }

    override fun on() {
        save()
        super.on()
    }

    override fun off() {
        save()
        super.off()
    }
}

class SmartTV(brand: String): Electronics(brand) {
    override fun on() {
        super.on()
    }

    override fun off() {
        super.off()
    }
}

fun main() {

}