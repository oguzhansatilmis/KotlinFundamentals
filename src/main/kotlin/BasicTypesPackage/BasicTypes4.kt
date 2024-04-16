package BasicTypesPackage


fun main(){

    /*
    Object-Type Array



    Primitive Type Array

    ByteArray
    ShortArray

     */

    //Primitive Type Array
    val byteArray = ByteArray(2)

    byteArray[0] = 1
    byteArray[1] = 2

    //Object Type Array

    val primitiveTypeArray = arrayOf(1,23,true)

    val emptyArray = emptyArray<String>()
    val emptyArray2 = emptyArray<String>()

    println("$emptyArray")
    println("$emptyArray2")

    println("-------")


    val arrayOfNull = arrayOfNulls<String>(4)

    arrayOfNull[0] = "sıfır"


    /*
    Array<Type>(size){

    }
     */

    val PI = Array<Double>(4){

        println(it)
        3.14 * it
    }

    PI.forEach {
        println(it.toString())
    }

    val carNames = Array<Int>(10){

        it*it
    }

    carNames.forEach {
        println(it)
    }

    val charArraySample = arrayOf('A','B','C') //Object Type Array

    val charArraySamplePrimitive:CharArray = arrayOf('A','B','C').toCharArray() //Primitive Type Array

    /*
      Aynı zamanda Array'ler üst class yerine atanamaz (invariant)

    val stringArray:Array<String> = arrayOf("a","b")

    val anyArray:Array<Any> = stringArray  HATA VERİR
     */

    /*
    Empty arrayleri genel ekleme işlemlerinde kullanırız.
     */


    // array collections farkı 


    toplam(12,4,5)


    /*
    vararg'ı arraylerde kullanmak istiyorsak "spread" (*) operatörü ile bir arrayin bütün elemanlarını tek tek value gibi atayabiliriz.
     */

    val lettersArray = arrayOf("c","d")

    val lettersArray2 = arrayOf(*lettersArray,"e","f")

    lettersArray2.forEach {
        println(it)
    }



    /*

    2 array aynı elemanlara sahip olsa bile referansları farklı olduğundan "==" durumunda  false sonucunu alırız
    Fakat bir array'i başka bir array'e  atarsak bu sefer aynı referansları gösterdiği için true sonucunu alırız.


    contentEquals içini(value) kontrol ediyor. Bu durumda arrayRef ve arrayRef2 aynı value'lara sahip olduğu için true sonucunu alırız.


     */
    val arrayRef = arrayOf(1,2,3,1,2,3,1,2,3,54)

    val arrayRef2 = arrayOf(1,2,3)


    val arrayRef3 = arrayRef2




    if (arrayRef == arrayRef2){
        println("arrayler eşit")
    }
    else{
        println("arrayler eşit değil")
    }

    if (arrayRef.contentEquals(arrayRef2)){
        println("arrayler value eşit" )
    }
    else{
        println("arrayler value  eşit değil")
    }


    if (arrayRef2 == arrayRef3){
        println("arrayler eşit (3.case)")
    }
    else{
        println("arrayler eşit değil (3.case")
    }


    arrayRef2.forEachIndexed{ index, i ->

        println(index)
        println(i)
    }

    println(arrayRef2.isEmpty())
    println(arrayRef2.lastIndexOf(0))
    println(arrayRef2.map {
        it*it
    })


    arrayRef.sort()

    println(arrayRef.joinToString())
    println(arrayRef.sum())
    arrayRef.shuffle() // random diziyi karıştırır
    println(arrayRef.joinToString())

    /*
    Array'ler List'e ve Set'e dönüştürülebilir.
     */

    val cities = arrayOf("Tekirdağ" to 59,"İstanbul" to 34 , "Erzincan" to "24")
    println( cities.toMap())


    val liste1 = listOf("a", "b", "c")
    val liste2 = listOf(1, 2, 3)


    val liste3 = arrayListOf(1, 2, 3)



    val birlesmisListe = liste1.zip(liste2)
    println(birlesmisListe)

    /*
    Arrayler List'lere göre performanslı çalışır.

    Array --- primitive tipler (String dahil) -- Boyutlar sabit
    ArrayList --- Object tabanlı yapılar içinde olabir. -- Boyutları dinamik şekilde değiştirilebilir.

     */


    val range = 1.rangeTo(100)
    val range2 = 1..100 // ..
    val range3 = 1.rangeUntil(100)
    val range4 = 1..<100
    val range5 = 'A'..'Z'
    val range6 = 100.downTo(1)

    val step = 10 until 100 step(3)

    println(range)
    println(range2)
    println(range3)
    println(range4)
    println(range5)
    range6.forEach {
        println(it)
    }
    println(step)



    /*
    Progression

   CharRange,IntRange,LongRange

    Float  ve Double için  ondalık'dan kaç sayi alacağı belli olmadığı için range yoktur.
         */

    val charRange:CharRange = 'A'..'D'

    println( charRange.step(1))
    println(charRange)

}

fun toplam(vararg sayilar :Int) :Int{

    var sonuc = 0

    sayilar.forEach {
        sonuc +=it
    }
    println("toplam : $sonuc")
    return sonuc

}
