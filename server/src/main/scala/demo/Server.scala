package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication class Server

object Server {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Server])
  }
}
