package PropertyVsField

class MyClass {

    var booleanValue: Boolean = false

    var balance: Int = 12312
        set(value) {
            if (value > 10) {
                booleanValue = true
                println("booleanValue $booleanValue")
                println("field 10'dan büyük")
            } else {
                booleanValue = false
                println("booleanValue $booleanValue")
                println("field 10'dan küçük")
            }
            println("eski field : $field")
            field = value
            println("yeni field : $field")
        }

    var sleep: Boolean = false
        get() {
            println("Function getter is called")
            return field  //Backing field
        }
        set(value) {
            field = value
            println("Function setter is called")
        }



    /*
   Backing properties example
     */
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}

/*
Backing field bu değişkende yok.Burdaki get() fonksiyondaki "kmh" bir field yani ramde bir yer işgal etmiyor.
 */
var MyClass.type
    get() = "kmh"
    set(value) {
        type = value
    }

fun main() {

    val result = MyClass()

    result.balance = 12
    result.balance = 6
    println(result.booleanValue)
    // println(result.type)
    /*
    Kotlinde değişkenler bir property olduğu için
     */

    result.table
}
