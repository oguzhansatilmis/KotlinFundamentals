package Class
/*
    -Enum class'lar belirli verileri gruplandırmamıza yarar.
    -Enum classlardaki değeler enum class'ı miras alın bir static class olarak bulunur.(Üst class'a implment ettiğimiz interface'yi)
        enum değerlerinde kullanabiliyoruz.
    -Enum class'lar miras alamaz.Ancak interface implement edilebilir.
    -Enum class'lar supertype olamaz(miras alınamaz-Data class gibi)
    -Enum class'ların için abstract open yapılar tanımlayabiliriz.,
    -Name ordinal şeklinde 2 tane özel fonksiyonu vardır.
        name-Name'i sitring bir şekilde döndürür.
        ordinal -Enum class'daki index bilgisini döndürür.

 */

fun main() {

    println(Teams.FENERBAHCE.name)
    println(Teams.BESIKTAS.ordinal)
    println("*************")
    println(Teams.FENERBAHCE)
    println(Teams.FENERBAHCE.getBestTeam())
    println(Teams.GALATASARAY.getBestTeam())
    println("*************")
    println(Teams.BESIKTAS.city)
    println(Teams.FENERBAHCE.city)
    println("*************")
    println(Teams.GALATASARAY.log())

    val team = "Fenerbahce".uppercase()

    // Expression kullanımı
    val city:String= when(team){
        Teams.FENERBAHCE.toString()->Teams.FENERBAHCE.city
        Teams.GALATASARAY.toString()->Teams.GALATASARAY.city
        Teams.BESIKTAS.toString()->Teams.BESIKTAS.city
        else -> {"Other Team"}
    }

    println(city)

}
data class TeamsInformation(val starCount: Int, val championship: String)
enum class Teams(val information: TeamsInformation) : EnumInterface {
    FENERBAHCE(information = TeamsInformation(3, "19")) {
        override fun log(): String {
            return FENERBAHCE.name +" Log"
        }

        override val city: String
            get() = "KADIKOY"

        override fun getChampionshipCount(): String {
            return FENERBAHCE.information.championship
        }

        override fun getStarCount(): Int {
            return FENERBAHCE.information.starCount
        }
    },
    GALATASARAY(information = TeamsInformation(4, "23")) {
        override fun log(): String {
            return GALATASARAY.name +" Log"
        }

        override val city: String
            get() = "SEYRANTEPE "

        override fun getBestTeam(): String {
            return super.getBestTeam()
        }
    },
    BESIKTAS(information = TeamsInformation(3, "16")) {
        override fun log(): String {
            return BESIKTAS.name +" Log"
        }

        override val city: String
            get() = "BESIKTAS"
    };
    open fun log():String{return ""}
    abstract val city:String

}

interface EnumInterface {
    fun getBestTeam(): String {
        return "Best Team Fenerbahce"
    }

    fun getStarCount(): Int {
        return 0
    }

    fun getChampionshipCount(): String {

        return "0"
    }
}







