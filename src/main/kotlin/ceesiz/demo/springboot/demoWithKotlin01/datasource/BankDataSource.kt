package ceesiz.demo.springboot.demoWithKotlin01.datasource

import ceesiz.demo.springboot.demoWithKotlin01.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}