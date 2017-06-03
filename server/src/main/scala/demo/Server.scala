package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(Array("demo.config"))
class Server {
}

object Server {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Server])
  }
}
