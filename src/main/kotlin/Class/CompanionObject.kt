
fun main(){


    val instance = Object().name
    val instance2 = Object().surName

    val instance3 = Object.A.age
    val instance4 = Object.city

    /*
    companion object ile normal object'in
    companion object'in farkı instance'nın bir örneği class içinde bulunur.City parametresine ulaşmak için
    Object.B.city gibi bir kullanımda "B" parametresini gereksiz olarak görür.Sebebi instance'ı class'ın içinde bulundurmasıdır.
     */

}
class Object(){

    val name:String = ""
    val surName:String = ""


    object A{

        val age = 2005
    }

    companion object B{

        val city = "Istanbul"
    }
}