fun main() {

    val a = Bird()

    val result = a.leg(2)
    val resultFly = a.flyBird()
    println(result)
    println(resultFly)
}


/*
   Abstract Classes vs Open Classes vs Interfaces

 */


class Bird : Animal(), Fly {
    override fun leg(count: Int): String {

        return "$count Leg"
    }

    override fun flyBird(): String {
        return "Bird is fly"
    }


}

interface Fly {
    fun flyBird(): String
}


abstract class Animal {

    abstract fun leg(count: Int): String

}