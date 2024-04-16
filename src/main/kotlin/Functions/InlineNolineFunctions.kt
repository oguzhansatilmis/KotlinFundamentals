package Functions


fun main() {

    /*

    Inline Functions
    Noinline Func
    CrossInline Func

     Inline --> Higher Order fonksiyonunun içine yazdığımız kodu fonksiyonumuzun içine kopyalar.
     Yani intance oluşturmaya gerek duymaz.Buda Performans artışına sebep olur.
     Eğer fonksiyon uzunsa build tam çok fazla artıcaktır.


     noinline --> Inline instance almak yerine kodu kendi kapmamında çalışmasını sağlar.Noinline bunu tersine dönüştürür.
       Fonksiyonlar bizden nesne isteyebilir.Ama inline nesne oluşturmadığı için hata almamak için noinline yazmamız gerekir.(Tip hatası)

     */

    /*
    Higher Order Func varsa - parametre olarak arka planda nesne oluşturuluyor.
    inline higher func çağrıldığı yere yapıştırılıyor.Bu sadece performans artışı oluyor.

    Bir higher order fonksiyonu başka bir higher order fonksiyona parammetre olarak verilirse ve o fonksiyonunun nesnesini istediği için
    bunu noinline yapmamız gerekiyor.İnline özelliği kapatmak gibi düşünebiliriz.
     */


    runAndPrint({
        println("run")
    }, {
        println("log")
    })
}

inline fun runAndPrint(run: (String) -> Unit, noinline logger: (String) -> Unit) {
    logger("Start")
    run.invoke("Message")
    logger("End")

    log(logger) // Logger artık inline olmayan bir fonksiyona dönüşür.
    //Biz parametre olarak nesne verdiğimiz için type mismatch hatası gibi bir hata veriyor.
}


fun log(logger: (String) -> Unit) {
    logger("Start")
}
