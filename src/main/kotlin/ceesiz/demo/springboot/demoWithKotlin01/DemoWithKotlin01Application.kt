package ceesiz.demo.springboot.demoWithKotlin01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class DemoWithKotlin01Application{

	// this method required for restTemplate usage
	@Bean
	fun restTemplate(builder: RestTemplateBuilder): RestTemplate = builder.build()

}

fun main(args: Array<String>) {
	runApplication<DemoWithKotlin01Application>(*args)
}
