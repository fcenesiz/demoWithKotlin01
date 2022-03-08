package ceesiz.demo.springboot.demoWithKotlin01.model

import com.fasterxml.jackson.annotation.JsonProperty

/*
    data class ile bu sınıfın, equals(), hashCode() ve toString() fonksiyonları oluşturulur.
    val kelimesi ile get oluşturulur.
    var kelimesi ile set oluşturulur.
    @JsonProperty, json dosyasındaki karşılıklarının ne olduğunu belirtir.
 */
data class Bank(

    @JsonProperty("account_number")
    val accountNumber: String,

    @JsonProperty("trust")
    val trust: Double,

    @JsonProperty("default_transaction_fee")
    val transactionFee: Int
)