fun main() {

    val result = fullName.getUserFullName()
    println(result)
   // fullName.printAge()  Local fonksiyon olduğu için erişemiyoruz
}
/*
    Class ve interface'ler superType olabilir.
    Type'ı User olarak belirlediğimiz için diğer implement'den gelen üyeleri kullanamıyoruz.
    fullname.age() -- kullanılamıyor.
 */
val fullName: User = object : User("oguzhan", "aaaa"),Age{

    override fun getUserFullName(): String {
        return "$name $surName"
    }

    override fun getAge(): Int {
      return 12
    }
    fun printAge(){
        println("age")
    }


}
abstract class User(username: String, userSurname: String) {
    val name: String = username
    val surName: String = userSurname
    abstract fun getUserFullName(): String
}
interface Age {
    fun getAge(): Int
}
