package ceesiz.demo.springboot.demoWithKotlin01.datasource.mock

import ceesiz.demo.springboot.demoWithKotlin01.datasource.BankDataSource
import ceesiz.demo.springboot.demoWithKotlin01.model.Bank
import org.springframework.stereotype.Repository

@Repository // marks this class as a SpringBoot bean; responsible with retrieving data, storing data, accessing entities
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5712", 0.0, 100)

    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull() { it.accountNumber == accountNumber }
            // this is for BankController error handling 'fun handleNotFound()'
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
    }

    override fun createBank(bank: Bank): Bank {
        if(banks.any{ it.accountNumber == bank.accountNumber}){
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exist!")
        }
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull{ it.accountNumber == bank.accountNumber}
            ?: throw NoSuchElementException("Could not find a bank with account number ${bank.accountNumber}!")

        banks.remove(currentBank)
        banks.add(bank)
        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull{ it.accountNumber == accountNumber}
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber!")
        banks.remove(currentBank)
    }
}