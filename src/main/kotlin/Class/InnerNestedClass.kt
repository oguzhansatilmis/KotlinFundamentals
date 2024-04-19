package Class

class Outer {

    private val param1 = ""
    val param2 = 0

    inner class InnerClass {

        // Outer().InnerClass()
        //Önce outer'ın instance'ını oluşturuduğu için memory'e yerleşiyor o yüzden erişebiliyoruz.

        fun getParams(): String {

            return "param1: $param1, param2: $param2"
        }
    }

    class NestedClass {

//        param1 Memory'ye yerleşmediği için ulaşamıyoruz.
        fun nestedClassGreeting() {

            println("Nested Class Greeting")
        }
    }
}

fun main() {

    Outer.NestedClass().nestedClassGreeting()
    /*
    Nested Class'lar Static biçimde tutuluyor.
    Outer Class'daki parametrelere erişemez.
     */

    val outer = Outer()
    outer.InnerClass().getParams()

    /*
    Inner Class'lar Outer Class'ın parametrelerine erişebilir.
    Inner Class'lar Static olarak tutulmuyor.Bu yüzden call ederken instance'nı oluşturmamız lazım.
    Static olmadığı için Outer'daki parametrelere  erişebilir.
    Static olan bir yaqı lifecycle boyunca yaşadığı için Outer class static olmasa bile dolayı yoldan o yapınında lifecycle boyunca
    yaşamasını sağlar buda istenmeyen bir durum olabilir.
     */


}