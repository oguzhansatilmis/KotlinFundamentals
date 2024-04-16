package Functions

fun main() {


    val myClass = sampleClass()

    myClass.listener = {

        println("Class'dan gelen number $it")
    }

    myClass.returnNumber(10)

    val sampleClass2 = sampleClass2()

    sampleClass2.listener = object : NumberCallBack {
        override fun onNumberReceived(number: Int) {
            println("interface'den gelen number $number")
        }
    }

    sampleClass2.returnNumber(20)


    calculateAndPrint(2,3) { numberOne, numberTwo -> numberOne + numberTwo }

    calculateAndPrint(20,13) { numberOne, numberTwo ->
        numberOne - numberTwo
    }



    /*
    HigherOrder Functionları tanımlamanın üç yolu vardır.

    Bir değişkene atayarak Fuction tanımlayabilirsiniz.

    ::Func bir fonksiyonun referansıı vermiş oluruz

     */

    /*
    Bir fonksiyonun body'sini bir variable'a atabiriz.
     */
    val higherOrderFuncVariable = { surname:String ->
        println(surname)
    }
    sampleFunction(higherOrderFuncVariable)

    /*
        :: Fonksiyonun body'sini çağırmış oluruz
    */

    sampleFunction(::surnameFunc)

    processVariable(2,3,::sum)
    processVariable(4,3) { numberOne: Int , numberTwo: Int -> numberOne + numberTwo }
    processVariable(4,3) { numberOne: Int , numberTwo: Int -> numberOne + numberTwo }

    calculateAndPrint2(2,3)



    /*
    Higher Func Extension Func'larla beraber yazılabilir.
     */

    calculateAndPrint3(2,3) { numberOne, numberTwo ->
        println("$this + ${numberOne + numberTwo}")
        34
    }
    /*
    Invoke -- Fonksiyonu Call eder
     */
}


fun processVariable(numberOne: Int,numberTwo: Int, sum:(numberOne:Int,numberTwo:Int)->Int){

    val sumResult = sum(numberOne,numberTwo)
    println("Result $sumResult")
}

fun sum(numberOne: Int,numberTwo: Int) = numberOne + numberTwo


fun surnameFunc(string: String){
    println(string)
}

fun sampleFunction(surnameFunc:(surname:String)->Unit){
    surnameFunc.invoke("satilmis")
}

fun calculateAndPrint(numberOne: Int,numberTwo:Int, operation :(Int,Int)->Int){
    val result = operation(numberOne, numberTwo)
    println("Result $result")
}

/*
Higher Order Fonksiyon default parametre atanır
 */
fun calculateAndPrint2(numberOne: Int = 10,numberTwo:Int=12, operation :(Int,Int)->Int ={numberOne,numberTwo -> numberOne + numberTwo}){
    val result = operation(numberOne, numberTwo)
    println("Result $result")
}


fun calculateAndPrint3(numberOne: Int,numberTwo:Int,operation :String.(Int,Int)->Int){
    val result = operation("Sayılar",numberOne, numberTwo)
    println("Result $result")
}



class sampleClass {

    var listener: ((Int) -> Unit)? = null

    fun returnNumber(number: Int) {
        listener?.invoke(number)
    }
}
class sampleClass2 {

    var listener: NumberCallBack? = null

    fun returnNumber(number: Int) {
        listener?.onNumberReceived(number)
    }

}
interface NumberCallBack {

    fun onNumberReceived(number: Int)
}


