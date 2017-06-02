package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication class Client

object Client {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Client])
  }
}
