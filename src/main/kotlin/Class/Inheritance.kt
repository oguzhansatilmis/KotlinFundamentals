
abstract class Human(val name: String) {

    abstract val surname:String
    private var age:Int = 23
    /*
    Abstract property'lere default value atanamaz
    Abstract class'lar state tutabilir.
     */
    constructor(name:String,age:Int): this(name){
        this.age = age
    }

    open fun getAge():Int {

        return age
    }

    abstract fun getFullName():String

}

open class Turks(name:String):Human("oguzhan",23){

    override  val  surname: String = "Turks class surname"
    override fun getFullName(): String {
        return "name surname"
    }

}

class Turk2():Turks("name"){

    override val surname: String
        get() = "asdas"


}


fun main(){

    // val human = Human("oguzhan",12)
    val result = Turk2().surname

    println(result)
}
