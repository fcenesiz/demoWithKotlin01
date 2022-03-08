package ceesiz.demo.springboot.demoWithKotlin01.datasource.network

import ceesiz.demo.springboot.demoWithKotlin01.model.Bank
import org.springframework.stereotype.Repository
import ceesiz.demo.springboot.demoWithKotlin01.datasource.BankDataSource
import ceesiz.demo.springboot.demoWithKotlin01.datasource.network.dto.BankList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import java.io.IOException

@Repository("network") // ("network") required for BankService Qualifier param, yani hangi dataSource kullanıldığı belirtildi.
class NetworkDataSource(
    @Autowired private val restTemplate: RestTemplate
) : BankDataSource {

    override fun retrieveBanks(): Collection<Bank> {
        val response: ResponseEntity<BankList> =
            restTemplate.getForEntity<BankList>("http://54.183.16.194/banks")
        return response.body?.results
            ?: throw IOException("Could not fetch banks from the network")
    }

    override fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

    override fun createBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun updateBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteBank(accountNumber: String) {
        TODO("Not yet implemented")
    }
}