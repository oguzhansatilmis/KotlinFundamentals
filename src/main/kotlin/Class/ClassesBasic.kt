


class FistClass(mName: String = "Tosbik", mAge: Int = 10, mEyeColor: String = "bir", isMale: Boolean = false):Any(){

    /*
    Kotlin de 2 farklı tür constructor vardır.
    Primary Constructor
    Secondary Constructor
     */
    var name: String = ""
    var age: Int = 0
    var eyeColor: String = "Blue"
    var isMale: Boolean = true

    /*
    init bloğu primary constructor call edildiğinde çalışır.
    Primary constructor 'ın body'sidir.
     */

    init {
        name = mName
        age = mAge
        println("Primary Constructor çalıştı")
    }

    /*
    Secondary Constructor
     */


// Instance'ı oluşturulamayan class
//    class AA private constructor(){
//
//    }
// val a = AA() --- Hata verir
}

fun main() {

    //val fistClass = FistClass("oguzhan", 10,"color",true)
    // val fistClass2 = Constructors(name = "oguzhan", i = 1)

    //val constructors2 = Constructors2("oguzhan")
    // val constructors = Constructors("oguzhan2")

    /*
    Class'larda primary constructor parametrelerini verirken --val,var-- kullanmak
    sanki parametre olarak verdiğimiz değişkenler  o Class'ın üyelik parametreleri gibi davranır.
     */

    // val myClass= MyClass("android",2005)
    //val myClass2= MyClass2("android2",20052)

    //myClass.myFunc()
    //myClass2.myFunc()

    val turtle = Turtle("tossba")

   // println(turtle.color)

    /*
    Classlar'da visibility modifiers(Görünüm beliryecisi)

    Kotlinde 4 tane vardır.
    Kotlinde bütün yapılar default parametresi public olarak bulunur.
    Java'da ise tam tersi private'dır.


       Her Class Any class'ından miras alır.
       Any class'ın içinde bulunan 3 metotu override edebilir.Tosting,equals,hashCode

    public --> Her yerden erişebilir
    private--> Üye değişkenlerin class'ın dışından erişilmesini engeller (get ve set metotları private olduğu için  erişemeyiz.)
    protected --> Fonksiyonlar ve constructor'larda kullanılır.Kendi sınıfı ve alt sınıfları için bir erişim belirleyecisidir.
    internal -->Aynı modüller içinde public,modülün dışında private olur.

    Kotlinde aslında değişken oluşturmuyoruz.Property oluşturduğumuz için o değişkene private verdiğimiz zaman get ve set fonksiyonlarını
        private hale getirmiş oluyoruz.
        Değişken kendisini hep private zaten (field) .Byte code'a dönüştürüp görebilisin.

        Turtle Class'ında detaylı olarak görebilirsin.

        Kotlinde  değiştirilecemeğimiz şekilde encapsulation yapılıyor.

        Bir fonksiyonun içinde local bir değişken oluşturduğumuzda "property" gibi değilde field gibi davranır.
            o değişkene private veya public verilemediğini görürüz


     */

}

fun fieldFunctions(){

  // private val nonProperty:String = "this is not property"  ---> Hata verir.
    val nonProperty:String = "this is not property"

    //Fonksiyonlardaki variable'ler read only değil immutable'dır.Çünkü bu property değil  field'dır.
}
/*
    constructor   keywordu --type ve modifier visibility kullanırsak yazmak zorunda kalıyoruz.

    @Inject
    --
    private constructor vb.
 */


class Turtle( name:String) {


    init {
        println(name)
    }
    constructor(name: String ,age:Int):this(name)
//    var color: String = name
//        set(value) {
//            field =value
//        }
//        get():String {
//            return field
//        }
}


class Constructors(name: String) {
    init {
        println("Init block")
    }

    constructor(name: String, i: Int) : this(name) {
        println("name: $name")
        println("Constructor $i")
    }
}


class Constructors2(name: String) {

    var isim = ""
    var age = 0

    init {
        isim = name
        println("Init block")
    }

    /*
    Secondary constructor kendi içinde kullanmasa bile primary constructor'ı işaret etmesinden dolayı bütün parametreleri içermek zorundadır
     */
    constructor(mName: String, mAge: Int, dummy: Int) : this(name = mName) {

        age = mAge
        println("Init block")
        println("Secondary block dummy $dummy")
    }


}


class MyClass public constructor(private val name: String, val age: Int) {

    fun myFunc() {
        println("Class'ın içindeki fonksiyon çalışt name: $name")
    }

}

class MyClass2(name: String, age: Int) {


    /*
    Direkt bir erişim sağlanamıyor. Primary constructor'da bu değerleri atamamız gerekti
     */
    var name: String = ""
    var age: Int = 0

    init {

        this.name = name
        this.age = age
    }

    fun myFunc() {
        println("Class2'ın içindeki fonksiyon çalışt name: $name")
    }

}
