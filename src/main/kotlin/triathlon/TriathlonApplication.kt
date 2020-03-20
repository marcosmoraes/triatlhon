package triathlon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TriathlonApplication

fun main(args: Array<String>) {
	runApplication<TriathlonApplication>(*args)
}
