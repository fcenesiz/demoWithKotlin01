package ceesiz.demo.springboot.demoWithKotlin01.model

/*
    data class ile bu sınıfın, equals(), hashCode() ve toString() fonksiyonları oluşturulur.
    val kelimesi ile get oluşturulur.
    var kelimesi ile set oluşturulur.
 */
data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)