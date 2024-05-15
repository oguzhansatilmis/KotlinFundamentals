package Generics


fun main() {

    val box: Box<Int> = Box<Int>(1)
    val box2 =Box<String>("1")

    println( demo3<Boolean,String>(true))
    println( demo3<Boolean,String>(false))

}
class Box<T>(t: T){
    var value = t
}
//Amac Herhangibi bir parametre verebilmek.
//Any kullandığımız zaman tip güvenliğini engellemiş oluyoruz.
//Generics Type'lara kullanarak ekstra kısıtlamalar yaparak tip güvenliğini sağlıyoruz.
//Kotlinde Generics yapılar invariant'tır.


// out co-variant kullanımlar için lazımdır.(Kendisi veya SubType'ları geçerli olsun istiyorsak) -- extends
//Any tipinde bir değişkene String atadık.
interface Source<out T>{
    fun nextT(): T
}

fun demo(strs:Source<String>){
    val objects :Source<Any> = strs
}

// out contravariant kullanımlar için lazımdır.(Kendisi veya SuperType'ları geçerli olsun istiyorsak)--super
//Dobule bir değere Number tipinde değişken atayabildik
interface Source2<in T>{
    fun nextT2(): @UnsafeVariance T
}
fun demo2(strs2:Source2<Number>){
    val objects :Source2<Double> = strs2
}

fun <T,String> demo3(param:T): kotlin.String {


  return  if (param == true) "true " else "false"


}
/*
Kotlin'de "reified" kelimesi, genellikle "inline" fonksiyonlarla birlikte kullanıldığında karşımıza çıkar.
Bu kavram, generic tür parametrelerinin runtime sırasında gerçek türlerine erişimini sağlar.
 */





