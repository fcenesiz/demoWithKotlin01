package ceesiz.demo.springboot.demoWithKotlin01.service

import ceesiz.demo.springboot.demoWithKotlin01.datasource.BankDataSource
import ceesiz.demo.springboot.demoWithKotlin01.model.Bank
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service


@Service
class BankService(@Qualifier("mock") private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)
}