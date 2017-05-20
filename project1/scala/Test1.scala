import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object Test1 {
	
	def timeFlies () {
		println("I am flying :)")
	}
	
	// taking function as parameter : functional programming ;)
	def registerCallBack(callBack : () => Unit) {
		while(true) {
			callBack()
			Thread.sleep(1000)
		}
	}

	def main (args : Array[String]) {
		// everything is an object in scala
		// so 1,100 etc are objects too
		// so I can call method on it
		val i = 10
		println(1 + 100 - 10)
		// bracket is required. Otherwise 1. instead of (1.) would have been interpreted as something like 1.x and it would fail
		println((1).+((100).-(10)))
		
		// Function as object
		registerCallBack(timeFlies)
	}
}