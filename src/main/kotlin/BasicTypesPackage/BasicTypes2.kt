package BasicTypesPackage

fun main() {

    val string: String? = null

    var degisken: String


    degisken = string?.let {
        "veri null değil "
    }.toString()

    println(degisken)


    val byte:Byte = 120
    val unshort:UShort = 65535u

    val value = 128
    val boxedNumber:Int? = value
    val unBoxedNumber:Int? = value


    /*

        Box -- Value'nın referansı tutar (Obje referansı tutar)
        UnBoxed -- Value' tutar (Primitive Type)

         == --> Value kontrol eder
        === --> Memory'deki referansları kontrol eder



        Nullable value'ler referans tiplidir.


        Bir nullable değişken tanımladık be bu Byte aralığında ise (-128 ,127)
        özel optimizasyonlar sayesinde primitive tip gibi davranıp bize aynı referansı döner.

        Byte aralığından büyük ise false döner.


         Peki neden Byte ????
     */

    println (boxedNumber === unBoxedNumber)


    /*
       Implicit Type Conversion -   Ortulu(Kapalı)  belirgin Tip Dönüşümü
       Explicit Type Conversion -   Acik Tip Dönüşümü

       Kotlin de Implicit Type Conversion yoktur.


        fun getValue(double:Number){
         println(double.toString())

         Number isminde bir üst class olduğu için "Double" yerine "Number" dersek istediğimiz bir number tipinde değişken verebiliriz.
}

     */

    val intValue = 20
    getValue(intValue.toDouble())


    val  shortValue:Int = 1254


    println(shortValue.toByte()) // anlamsız sonuçlar verir

    val longNumber = 2_100_000_000
    val longNumber2 = 2_100_000_000

    val result = longNumber*longNumber2 // This operation has led to an overflow

    println(result)


}



fun getValue(double:Double){
    println(double.toString())

}