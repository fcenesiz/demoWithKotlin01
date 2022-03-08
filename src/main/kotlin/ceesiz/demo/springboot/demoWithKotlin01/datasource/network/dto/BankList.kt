package ceesiz.demo.springboot.demoWithKotlin01.datasource.network.dto

import ceesiz.demo.springboot.demoWithKotlin01.model.Bank

data class BankList(
    val results: Collection<Bank>
)