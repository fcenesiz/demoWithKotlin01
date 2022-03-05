package ceesiz.demo.springboot.demoWithKotlin01.datasource

import ceesiz.demo.springboot.demoWithKotlin01.model.Bank

interface BankDataSource {

    fun getBanks(): Collection<Bank>

}