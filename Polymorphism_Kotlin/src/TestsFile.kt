class ContaBancaria {
    var saldo: Double = 0.0
        get () = field
        set (value) {
            if (value > 0) {
                field = value
            }
    }
}