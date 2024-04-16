package BasicTypesPackage

import java.security.Principal
import java.util.*
import kotlin.collections.ArrayList
import kotlin.io.path.fileVisitor

fun main() {

    val string1: String = "string"
    val string2: String? = null

    val sayi: Byte? = 12
    val sayi2: Int? = null


    val x: Number = 2

    x.toByte()

    when (x) {
        is Int -> println("Integer")
        is Byte -> println("Byte")
        is Long -> println("Long")
    }

    /*
    Smart Cast

       val smartCast = "oguzhan"

    smartCast as Int

    smartCast.length
     */

    /*
    Stack ve Heap ??

    Referans kendisi stack'de value Heap üzerinde tutuluyor.

    Null'a çektiimiz zaman Stack'deki yeri korunuyor fakat Heap'de tuttuyor yer boş oluyor.
    Yani null'a çektiğimiz zaman veri tamammen memory'den yok olmaz.

     */

    /*
        --Char
        16 bit yer kaplar.




     */

    val char: Char = '6'

    val result = char.code
    println(result)  //-- asci tablosunda olan değeri basar


    //Unicode  Metinsel mesajları sayısal değerde tutan bir evrensel kodlama dili
    // Escape Karakterleri  (\ \n) gibi  vb


    val blackHeart = '\u2665'
    println(blackHeart)

    val char2: Char? = null


    /*
    Boolean
    8 bit yer kaplar
     */


    /*
    || ve && operatörleri lazily çalışma mekanizmasına sahiptir.

     || eğer sol taraf true ise sağa bakılmaz
     && eğer sol taraf false ise  sağa bakılmaz
     Kodun daha hızlı çalışması için yapılmıştır.

     */

    /*
        val awesomeKekod = "KeKod is Awesome"
    println( harfSayisiHesapla(awesomeKekod))

    val harfSayilari2 = mutableMapOf<Char, Int>()
    harfSayilari2['2'] = 3
     */


    //String
    /*


    Yaklaşık her karakter başına 2 byte yer kaplar.UTF-16 encoding kullanır.

        Stringler immutable'dir.Bir string ilk değer ataması yapıldıktan sonra değeri değiştirilemez.
        Yeni bir string object döndürür.
         Garbage collector eski objeyi silicektir.

             var name = "oguzhan"
            name = "oguzhan1"


      */

    val name = "oguzhan"
    val integer = 12
    val name2 = "oguzhan1"

    println(name2 + integer)

    val rawPineTree = """
        *   *
        ***
        ********
       **
    """.trimIndent()

    println(rawPineTree)

    val rows = 5

    for(i in 0 until rows){

        for (j in 0 until rows-i) print(" ")
        for (j in 0 until 2*i+1) print("*")

        println()
    }


    val sayi5 = 123213289.89
    val usFormat = String.format(Locale.US,"us formatında %,.2f ",sayi5)
    println(usFormat)

    val myString = MyString()
    myString.value = "value "
    println(myString.value)

}

fun harfSayisiHesapla(metin: String): Map<Char, Int> {

    val harfSayilari = mutableMapOf<Char, Int>()

    for (harf in metin) {

        val harfKucuk = harf.toLowerCase()

        harfSayilari[harfKucuk] = harfSayilari.getOrDefault(harfKucuk, 0) + 1
        println(harfSayilari)


        val value4:Int  = 3
    }

    return harfSayilari


}
class MyString {
    var value: String = ""
        get() {
            println("Value get() cağrıldı.")
            return field
        }
        set(value) {
            println("Value set() cağrıldı")
            field = value
        }

}

