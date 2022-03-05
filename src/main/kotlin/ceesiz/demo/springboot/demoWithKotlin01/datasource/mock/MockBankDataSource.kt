package ceesiz.demo.springboot.demoWithKotlin01.datasource.mock

import ceesiz.demo.springboot.demoWithKotlin01.datasource.BankDataSource
import ceesiz.demo.springboot.demoWithKotlin01.model.Bank
import org.springframework.stereotype.Repository

@Repository // marks this class as a SpringBoot bean; responsible with retrieving data, storing data, accessing entities
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5712", 0.0, 100)

    )

    override fun retrieveBanks(): Collection<Bank> = banks
}