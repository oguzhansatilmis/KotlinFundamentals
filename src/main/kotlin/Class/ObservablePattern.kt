import kotlin.properties.Delegates


var value by Delegates.observable(0){ property, oldValue, newValue ->
    println("old value $oldValue -> new value $newValue")
}

var value2 by Delegates.vetoable(10) { property, oldValue, newValue ->
    println("old value $oldValue -> new value $newValue")
    newValue > oldValue
}


fun main() {
    value = 10
    value2 = 3
    println(value2)
    println("value running $value")

    val observableClas = ObservableClas(object : Notify {
        override fun onNotify(oldValue: Int, newValue: Int) {
            println("Value değişti oldValue: $oldValue newValue: $newValue")
        }
    })

    observableClas.balance = 12321
    observableClas.balance = 121

    val observableClas2 = ObservableClas2 { oldValue, newValue ->
        println("Value değişti oldValue: $oldValue newValue: $newValue")
    }
    observableClas2.balance = 12
    observableClas2.balance = 24
    observableClas2.balance = 36
}

interface Notify {
    fun onNotify(oldValue: Int, newValue: Int)
}

/*
    Observable Pattern
    Bir değişkenin değeri set edilirken bunu dışarı bildirmek olarak özetlenebilir.
 */

class ObservableClas(private val notify: Notify) {
    var balance = 0
        set(value) {
            notify.onNotify(field, value)
            field = value
        }

}

class ObservableClas2(private val notifyFun: (Int, Int) -> Unit) {
    var balance = 0
        set(value) {
            notifyFun.invoke(field, value)
            field = value
        }

}