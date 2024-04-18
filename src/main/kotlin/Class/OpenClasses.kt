interface interfaceDeneme {

    fun foo(string: String) {

        println(string)
    }

    fun voo(string: String)

    class naber() {
        var a = "deneme"
            get() = "aasdasd"
            set(value) {
                field = value
            }
    }

    /*
       var text: String
        get() = "text"
        set(value) {
            field  ="ete"
        }
     */

}

/*
 constructor'a sahip değildir.

 object keywordu ile instance' oluşmuş gibi davranır.
 Başka bir interface'den implement edilebilir.

 child class'lara fonksiyonların override edilmesini istemiyorsak abstract class kullanılırız.-- abstract interface farkı
 Final keywordu kullanılamaz

 interface state tutmaz.State tutmak istiyorsak abstract  class kullanmamız gerekiyoor.
 */

open class classDeneme: interfaceDeneme {

    open fun naberFonk(){}
    override fun voo(string: String) {
        println(string)
    }

    override fun foo(string: String) {
        super.foo(string)
    }

}

fun main() {

    val instance = classDeneme()

    instance.foo("asdas")
    instance.voo("asdsadsa21213")


    println(interfaceDeneme.naber().a)


    val interfaceObject = object : interfaceDeneme {
        override fun voo(string: String) {
            TODO("Not yet implemented")
        }

    }
    val classDeneme = object : classDeneme() {
        override fun naberFonk() {
            super.naberFonk()
        }
    }

}

