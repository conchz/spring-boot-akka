package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication open class Client

fun main(args: Array<String>) {
    SpringApplication.run(Client::class.java, *args)
}
