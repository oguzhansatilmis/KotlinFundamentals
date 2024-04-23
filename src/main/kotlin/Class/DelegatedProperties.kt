package Class

fun main() {

    val cardDetailFragment = CardDetailFragment()
    cardDetailFragment.getUserInformation()
    cardDetailFragment.getUser2Information()
}
data class User10(val name: String, val surname: String, val age: Int)

class CardDetailFragment {

    private val user: User10 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("user running")
        User10("oguzhan", "satilmis", 27)
    }
     private lateinit var user2: User10

    init {
        println("init running")
    }
    fun getUserInformation() {
        println("${user.name},${user.surname},${user.age}")
    }
    fun getUser2Information() {
        user2 = User10("android", "2006", 18)
        println("${user2.name},${user2.surname},${user2.age}")

    }

}


