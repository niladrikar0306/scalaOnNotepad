import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object AnnoFn {
	
	
	
	// taking function as parameter : functional programming ;)
	def registerCallBack(callBack : () => Unit) {
		while(true) {
			callBack()
			Thread.sleep(1000)
		}
	}

	def main (args : Array[String]) {
		
		//registerCallBack(() => println("Time is flying"))
		registerCallBack(() =>{ 
			println("Time is flying")
			println("I am trying to catch")
		})
	}
}