package Class

import kotlin.Result


/*
   Sealed Class
    -Classları belirli bir hiyerarşi ile gruplandırmamızı  sağlar.(Enum class'lar verileri gruplar.)
    -Enum classlardan en büyük farkı arka planda classları static tutmaz.
    -Sealed Classlar abstract class oldukları için instance'ı alınamaz ve final keywordu kullanılamaz
    -Belirli bir sınıf kümesini kısıtlamak için kullanılır.
    -Parametreleri class keywor'du ile tanımlandığı için harici extends'ler alabilirler.
*/

fun main() {

    val result = Response.Success()

    when (result) {

       is Response.Success-> {

            Response.Success().sealedInterfaceFunctions()

        }
        else -> {
            println("Else run")
        }
    }
}

sealed class Response {
    class Success : MyResponse(),sealedInterface {

        override fun sealedInterfaceFunctions() {
            super.sealedInterfaceFunctions()
        }
    }
    class Progress : Response() {}
    class Error : Response() {}

    val number: Int = 10

}
interface sealedInterface{

    fun sealedInterfaceFunctions(){

        println("Functions run ")
    }
}
sealed class Resource<T> {
    class Success<T>(val data: T) : Resource<T>()
    class Error<T>(val message: String?) : Resource<T>()
    class Loading<T> : Resource<T>()
}

open class MyResponse() : Response()