package Class
/*
    Value class
    Backing field içermiyor.
    Şuan için sadece bir parametre içeriyor.
    Referans tipli değişkenleri primitive tip gibi davranmasını sağlıyor ?????
*/
fun main() {

    val result = ValueClassExample("12")
     result.number

    /*
    Typealias kullanım örnek
     */

    val typeAliasExample = a()
}
@JvmInline
value class ValueClassExample(val value: String) {
    init {
        println("Value class init run")
    }
    val number: Int
        get() = 12

//    val number2 = 12312  Hata veriyor.
}
/*
 Bir class'ın constructor'ı private ise instance'ı oluşturulamaz.
 */
/*
   Typealias
    -Yeni bir class oluşturmazlar.Sadece etiketleme yaparlar.
 */


typealias a = AAAA

class AAAA

class AAA private constructor() {
    var a = 12
        get() = 435
        set(value) {
            field = value
        }
}