package ControlFlow


fun main() {


    /*
     i++ --Önce print et sonra yazdır.(Önce işlemi yap sonra attır)
     ++i -- Direkt artırır


     var i:Int= 2
     var a:Int= 2

     var i= 2
     var a= 2
     */

    var i: Int = 2
    var a: Int = 2

    println(i++)
    println(i)
    println(++a)
    println(--a)

    val obj: Any = "obj"

    when (obj) {

        "obj" -> println("bu bir string")
        else -> println("else")

    }
    if (i == a) {
        println("if --case 1 ")
    } else {
        println("else --case 1 ")
    }

    if (i === a) {
        println("if --case 2 ")
    } else {
        println("else --case 2 ")
    }


    /*
 Eğer  value nullable şeklinde ise bu oparatörleri kullanmaktan bize avantaj sağlar.Otamatik şekilde null check yapar.
  */
    val grade = 65
    val grade2 = 100
    val grade3 = 160

    println(grade.compareTo(100))
    println(grade2.compareTo(100))
    println(grade3.compareTo(100))


    notHesapla(null)


    /*
    is -- Type kontrolü
    as-- Type dönüştürme
     */

    val numberOne: Int = 12


    val adana = numberOne.toLong()

    numberOne as Number

    println(numberOne is Number)


    println(a.unaryMinus())

    /*
    a.unaryMinus sayiyi negatife çevirir.
     */

    /*
    İF - ELSE

     State Kullanımı


     Expression Kullanımı
     */

    val answer = "Evet"

    //State Kullanımı

    if (answer.contains("evet",ignoreCase = false)){

        println("Öğrenci")
    }
    else{
        println("Öğrenci değil")
    }

    //Expression Kullanımı


    val result:String = if (answer.contains("evet",ignoreCase = false)){
        "Öğrenci"
    }
    else{
        "Öğrenci değil"
    }

    println("result $result")



    val number = 10
    val number2:Number = 10

    if (number == number2){
        println("doğru")
      //  throw IOException()
     // return
    }

     println("doğru değil")

    /*
    When(karsilastiralacak_ifade)

            value -> {}
             value,value2 -> {}
             else -> {}

     */

    val countryCode  = readln()

    when(countryCode){

        "us" -> println("Us")
        "tr","az" -> {
            println("Tr ve 90 ")
        }

    }

    /*
    is - > Referans check yapar
    in -> Range'ler için kullanılır
     */
    when(number){

        in 0..10-> println("0 - 10 arasındadir.")
        in 10..20-> println("10 - 20 arasındadir.")
    }


}

fun notHesapla(not: Int?) {

    when (not?.compareTo(100)) {

        -1 -> println("küçük")
        0 -> println("eşit")
        1 -> println("büyük")
        else -> println("null geldi")

    }


}

