package ceesiz.demo.springboot.demoWithKotlin01.service

import ceesiz.demo.springboot.demoWithKotlin01.datasource.BankDataSource
import ceesiz.demo.springboot.demoWithKotlin01.model.Bank
import org.springframework.stereotype.Service


@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}