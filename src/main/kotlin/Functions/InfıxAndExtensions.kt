package Functions

import java.util.*


fun main(){

   // println( factorial(4))

    /*
    Infix Fonksiyonu
    1-Infix ile başlar
    2.Fonksiyon bir üye fonksiyonu olmalı.(Bir sınıfa ait olması gerekiyor)
    3.Extensions fonksiyon olması gerekiyor
    4.Sadece bir parametre alır.(Default value veya valargs alamaz)

    Infix kullanımı aşağıda örnek verilmiştir.
    Mantık operatörlerinde İnfix fonksiyonlar öncellikli
    Matematiksel operatörler ise infix öncelikli değil
    and xor gibi fonksiyonlar infix fonksiyonlardır.

     */
    val a = AwesomeClass()

    a.downloadFunc("URL")
    a downloadFunc "URL"


    /*
    Extensions Functions

    Read Only bir class'ı yada üzerine bir bir fonksiyon yazmak istemediğimiz class'ı sanki o class'ın bir fonksiyonu gibi kullanmamıza yarar.
    Private fonksiyonlarına erişemez
    O class'ın Üyelik fonksiyonu olmaz.
     */

    /*
    Top Level Fonksiyonlar

    Kotlin'de, bir sınıf içine veya bir nesnenin üyesi olarak tanımlanmayan, doğrudan dosya seviyesinde tanımlanan fonksiyonlara "top-level fonksiyonlar" denir.
    Bu fonksiyonlar, herhangi bir sınıfın üyesi olmadan doğrudan kullanılabilir ve çağrılabilirler.

    Eğer extensions fonksiyonları bir class'ın içinde yazarsan sadece o class'a kullanabiliriz.
    Global kullanım için Top Level (Bir File 'ın içine yazılırsa) Bütün  projeden erişebilir olmaktadır.

     */

    val myClass = AwesomeClass()
    println(myClass.temp)

    val result:String = "bir".extensionsOrnek(1)

    println("result $result")
}

fun String.extensionsOrnek(number:Int):String{

    println(this.uppercase( Locale.UK))

    return  if (number == 1){
        this.uppercase( Locale.UK)
    }
    else{
        " sayı bir değil"
    }

}


//Recursive Fonksiyon örneği
fun factorial(n: Int): Int {
    return if (n == 0) {
        1 // Temel durum: 0! = 1
    } else {
        n * factorial(n - 1)
    }
}

open class AwesomeClass(){

    infix fun downloadFunc(url:String){

        println("url: $url")

    }
}

var AwesomeClass.temp:String
    get() = "Temp Variable"
    set(value){
        temp = value
    }

