package Functions

import kotlin.math.pow
import kotlin.random.Random

fun main(){

    /*
    Loops(Döngüler)
     */

    for(value:Int in 0..10){

        println("value: $value")
    }
    for(x in 0 until 10 ){

        println("value: $x")
    }

    val list = arrayListOf("bir","iki","üç")




    for (x in list){
        println(x)
    }

    for ((index,value) in list.withIndex()){
        println("$index $value")
    }

    /*
 Array'lerin -- with.Index()  metotodunu kullanarak index + value değeri döndürüleblir.
  */

    repeat(2){
        println("repeat fonksiyonu çalıştı.")
    }


    for(x in list.indices){


        if (x == 1){
            continue
            // break

        }
        println("value: $x")

    }
    /*
    continue -- döngüsüyü atla

    break döngüsüyü sonlandı
     */


    /*
    Elvis operatörü

    sol taraf null değilse sol tarafı al eğer null ise sağ tarafı al
        (case1 )?: (case2)

     */

    val number :Int? = null

    val result = number ?:0

    println(result)

    /*
    İç içe for dongülerinde ,bir bir üstündeki for döngüsüne geri dönmesi için @labelname verebilir.

    Bu örnekte "returnLabel@" bu kullanıldı.
     */

    returnLabel@for( value in 0 until 10){

        for(value2 in 0  until 5){

            if (value == 2){
                continue@returnLabel
            }
        }
    }

    val numSamples = 100
    val estimatedPi = monteCarloPi(numSamples)
    println("Estimated Pi: $estimatedPi")


    val r = 3.0


    println(r.pow(2))


    /*
   55 dk
    */

    returnLabel@for(value in 0..<10){

        for (value2 in 0..10){

            if (value2 == 2){
                break@returnLabel
            }
            println("break2 $value2")
        }

    }

    /*
    While döngüsü for + bir if koşuluna denk gelmektedir.
     */

    val array = arrayOf(2,3,1,411,5,65,7,8,23,8,4,7)

    var temp = 0
    var temp2 = 0

    for (value in array){

        for (value2 in array){

            if (value == value2){
                continue
            }
            else{

                temp = maxOf(value,value2)
                temp2 = maxOf(temp,temp2)
            }

        }
    }
    println("temp $temp2")

    //Functions


    /*
    Default Params yada Name Params
    Default value'lar bize overload yapmayı sağlıyor.

    Bir fonksiyon default parametleri yada başka tipte parametreli haline fonksiyon overloading denir.
    JVM  arkada aynı zamanda birde default parametleri  fonskiyonları  oluşturuyor

     */

    takeSquare()
    println( sumParams(1,5,2,45))

}
@JvmOverloads
fun takeSquare(number:Int = 4) :Int{

    val returnParams = number*number
    println(returnParams)
    return returnParams


}

fun sumParams(vararg params:Int) :Int{

    var sum = 0

    params.forEach {
        sum +=it
    }
    return sum
}

fun monteCarloPi(numSamples: Int): Double {
    var insideCircle = 0

    for (i in 0 until numSamples) {
        val x = Random.nextDouble()
        val y = Random.nextDouble()

        val distance = x.pow(2) + y.pow(2)

        if (distance <= 1) {
            insideCircle++
        }
    }

    return (insideCircle.toDouble() / numSamples) * 4
}