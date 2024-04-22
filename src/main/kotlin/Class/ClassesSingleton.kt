package Class
/*
     Singleton Pattern
     Herhangi bir t anında ilgili class'ın sadece bir tane olduğunu garanti eden taşarım şablonudur.

     1-Constructor' private'a çek(Instance' oluşturulmasını engelle)
     2-Singleton olmasını istediğimiz class'ın bir değişkenini oluştur.(private şeklinde)
     3-Class'ın instance'ını döndüren bir public  fonksiyon yaz(Null kontrolü yaparak.)
 */

fun main() {

    val notSingletonClass = NotSingletonClass()
    println(notSingletonClass.getterValue())
    println(notSingletonClass.getterValue())
    println(notSingletonClass.getterValue())

    println("-------------------")

    val singletonClass = Singleton.SingletonClass()

    println(singletonClass.getterValue())
    println(singletonClass.getterValue())
    println(singletonClass.getterValue())

    println("***********************")

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
class NotSingletonClass {
    private var value = 0
    fun getterValue(): Int {
        value = value++
        return value
    }
}

object Singleton {
    class SingletonClass {
       private var value = 0
        fun getterValue(): Int {
            return value++
        }
    }
}



