interface Dev {
    var money: Float
    fun bonus(): Float
}

class Mobile(override var money: Float): Dev {
    override fun bonus(): Float {
        return money
    }

}

class Game(override var money: Float): Dev {
    override fun bonus(): Float {
        return money
    }

}

class Web(override var money: Float): Dev {
    override fun bonus(): Float {
        return money
    }
}

fun showMoney(d: Dev) {
    println(d.money)
}

fun main() {
    showMoney(Game(3000f))
    showMoney(Mobile(2000f))
    showMoney(Web(4000f))
}