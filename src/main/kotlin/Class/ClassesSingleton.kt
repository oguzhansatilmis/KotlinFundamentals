package Class
/*
     Singleton Pattern
     Herhangi bir t anında ilgili class'ın sadece bir tane olduğunu garanti eden taşarım şablonudur.

     1-Constructor' private'a çek(Instance' oluşturulmasını engelle)
     2-Singleton olmasını istediğimiz class'ın bir değişkenini oluştur.(private şeklinde)
     3-Class'ın instance'ını döndüren bir public  fonksiyon yaz(Null kontrolü yaparak.)
 */
fun main() {

    val age = 0
    val notSingletonClass = NotSingletonClass()
    println(notSingletonClass.getterValue())
    println(notSingletonClass.getterValue())
    println(notSingletonClass.getterValue())
    println("-------------------")
    println(Singleton.getterValue())
    println(Singleton.getterValue())
    println(Singleton.getterValue())
    println("***********************")


    notSingletonClass.function()
    /*
    0
    0
    0
    -------------------
    0
    1
    2
     */
}
class NotSingletonClass:StateInterface{

    private val localValue = ""
    private var value = 0
    fun getterValue(): Int {
        value = value++
        return value
    }

    override fun function(): String {
        val local = super.function()
        println("interface'den gelen value $local")
        return ("interface'den gelen value $local")
    }
}

object Singleton {
    private var value = 0
    fun getterValue(): Int {
        return value++
    }

}
class SingletonThreadSafe private constructor() {
    companion object {

        @Volatile private var instance: SingletonThreadSafe? = null
        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonThreadSafe().also { instance = it }
            }
    }
}

/*
    Companion object 'in temel kullanımı class'ın tamamını değilde belirli bir kısmını singleton yapmak için kullanılır.
 */
interface StateInterface{

   // val value = "navigate" İnterface'ler state tutmaz.
    val notState               //Bu value'nun field'ı yok.Sadece getter fonksiyonu tanımlanmış
        get() = "navigate"
    companion object{

       val staticValue = "navigate"
       const val staticValue2 = "navigate"
        /*
        Değer derleme zamanında biliniyorsa const val .
        Değer çalışma zamanında hesaplanıyorsa val .
         */
        //companion object bytecode karşılığında bir static class olarak bulunur.
        // Bu sadece interface'lere state tutturabiliriz.
        //Kullanımı yanlıştır.Interfaceler'state tutmaz.
    }
    fun function():String{

        return staticValue
    }
}


