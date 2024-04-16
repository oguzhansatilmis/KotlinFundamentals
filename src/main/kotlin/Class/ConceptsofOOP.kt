package Class

fun main() {
    /*
    val instanceEncapsulation = Encapsulation()
    instanceEncapsulation.setFullName("oğuzhan", "SATILMIS")
    println(instanceEncapsulation.getFullName())
     */

    val dog = Dog("Karabas")
    val cat = Cat("Boncuk")
    dog.walk()
    cat.walk()
    println(dog.makeASound())
    println(cat.makeASound())

    println(cat.name)
    println(dog.name)

}


class Encapsulation {

    private lateinit var name: String
    private var surName: String = ""


    fun setFullName(mName: String, mSurname: String) {

        name = mName
        surName = mSurname
    }


    fun getFullName(): String {
        return "$name $surName"
    }


    /*
    Encapsulation
    Class'ın üyelerini private'da tut.
    Erişilmesini gerekenleri belirli ve sadece onları dışarıya açık tut.

    Neden böyle bişey var ?

    Alakası olmayan yerlerden erişilip düzeni veya ilerleyeşi  engellememesi.
    İhtiyacı olmayan bir class için erişimini kısıtlayayıp karmaşıklığı azaltma

    Bir class'ın üyeliklerini yazarken hep private olarak yaz.Ondan sonra gerekli üyeleri public moda çekebilirsin.*/


}

open class Animal(mName: String) {

    open var name: String = "Karabas"
    val color: String = ""
    val feetCount: Int = 0

    fun walk() {

        println("$name is walk")
    }

    fun eatMeal(): String {

        return ""
    }

    open fun makeASound(): String {

        return ""
    }

    /*

    Kotlinde default final (miras alınamaz- final ) şeklinde tanımlanır.Bu javadan farklıdır.Orda public ile tanımlanır ve miras alınablir.
    Bu prensip'in temel amacı  eğer bir class' miras alındı ise bunu belirtmek.Java da bunu belirtmediği için
    bir class tarafından miras alındığını bilemeyiz.


    Open keyword'u ile bir sınıfı miras alınabilir hale getiririz.
    Inheritance aldığımızda üst class'daki üyeleri override edebiliriz.



 Dinamik Polymorphism

   Üst class'da bir fonksiyon var. Child class'larda override ederek  bunu farklı sonıçlar vermesi polymorphisim örneğidir.
   Kedi ve köpek class'ı için --makeASound fonksiyonu override ettik --
   Çünkü ikisininde çıkardıkları sesler farklı.
    Override yapmamız sorunludur.


 Statik Polymorphism

    Fonksiyon overload ile aynı mantıkda çalışır
    İki aynı isimli fonksiyon var.
    Bunların farklı parametreleri var.
    Bunların farklı şeyler return ediyor.
    Yada farklı sayıda parametreleri var.
    Statik polymorphisim kısaca özeti.


    Default değerler vererek statik polymorphisim'i iptal edebilirz.

     overload yapılır.

  */


}

class Dog(mName: String) : Animal(mName) {

    override fun makeASound(): String {
        return "Hav Hav"
    }
}

class Cat(override var name: String = "Boncuk") : Animal(name) {

    override fun makeASound(): String {
        return "Miyav Miyav"
    }
}



