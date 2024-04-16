package Class

//Data Class



data class User(var name: String) {

    var age: Int = 2005

    constructor(name: String,age:Int):this(name){
        this.name = "oguzhan"
        this.age = 27

    }

    fun getAge(name: String):String{
        return name+"getter"
    }
}
data class User2(val name: String) {

    val age: Int = 2005
    val isHuman: Boolean =false

    override fun toString(): String {
        return "super.toString()"
    }
}
data class User3(val name: String) {

    val age: Int = 2006
}

class A(val a :String){

    fun hello(){
        println(a)
    }

}
/*
Bir class primary constructor'na property atarken
    --Başına "val" ya da "var" koymamız o property'e class' içindeki fonksiyonlardan erişmemizi sağlar.
    --Aynı zamanda Class'ın instance'ını oluşturduğumuz zaman da o property'e erişememize sağlar.
 */

/*
        Data Class
        En az primary constructor'ına bir parametre almalı.
        val ya da var ile tanımlanmalı.
        Kendine özgü 4 tane fonksiyonu var.copy,toString,hashcode,componetN

        Bu fonksiyonların çalışması için val ya da var ile tanımlanması lazım çünkü bu parametrelere ulaşması gerekiyor.

 */

//class Car(var horsepowers: Int) {
//
//   var model:String = "Default Clio"
//
//    init {
//        println("init running")
//        horsepowers = 10
//    }
//
//    constructor(horsepowers: Int, model:String):this(horsepowers){
//        println("secondary constructor running")
//        this.model =model
//    }
//
//    companion object Factory {
//        val cars = mutableListOf<Car>()
//        fun makeCar(horsepowers: Int): Car {
//            val car = Car(horsepowers)
//            cars.add(car)
//            return car
//        }
//    }
//}


//    class User(var name: String = "Süleyman", var age: Int = 30) {
//
//        companion object {
//            var nation: String = "Turks"
//        }
//
//
//        init {
//            println("name ${this.name}")
//            println("name ${this.age}")
//
//        }
//
//
//    }

fun main() {

    val classA = A("a")
    classA.hello()
//    val car = Car.makeCar(90)
//    println(car.model)
//
//    val car2  =Car(90,"Tofaş")
//
//    println(Car.cars.size)



//    val user = User("adas",20)
//    val user2 = User("qweqw",12)
//    println("*****************")
//
//    println(User.nation)
//    println(User.nation)
//
//    User.nation = "Turkss"
//    println("*************")
//
//    println(User.nation)
//    println(User.nation)

    /*
        En az 1 parametre mutlaka alması gerekiyor.
        Parametreler mutlaka val ya da var olarak tanımlanmalıdır.
        open,abstract gibi keywordleri kullanamayız.(Default olarak final keywordu olarak gelir.)
        equals,hashCode,toString,copy,componetN(kaç parametre varsa) gibi metotları vardır.
        toString metodu loglamamızı kolaylaştırır.
        Super Type olarak bulunamaz
        Bu fonksiyonlar eskiden java ile elle yazılıyor.Kotlin bu fonksiyonları özel olarak içeren bir data class
        yapısı oluşturdu.

        Constructor'ın dışına yazılan bir değer için bu fonksiyonlar kullanılamaz

   */

    val user = User("Android")
    val user2 = User("Android2")
    val user3 = User3("Android42")

    /*
    Farklı bir kullanım
    Componet Fonksiyonları sayesinde
    destination turing decreasing
    https://stackoverflow.com/questions/51587403/component-destructuring-with-fewer-than-expected-components
     */
    val (name) = user3

    println( user.component1())

    println(user.equals(user2))
    println("----------")

    println( user.getAge("123"))

    val user4 = User("Copy metodunu deniyorum").copy(user.component1())
    println(user4.name)
    println(user2.toString())

    println(user2.hashCode())
    println(user4.hashCode())
    println(user3.hashCode())
    println(user3.hashCode())
}


