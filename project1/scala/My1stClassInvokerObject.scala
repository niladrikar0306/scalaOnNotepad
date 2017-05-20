

object My1stClassInvokerObject {
	def main(agrs : Array[String]) {
		println("I am ready to invoke")
		val ob1 = new My1stClass(2.5,5.6)
		println(ob1.reWithTypeInferredReturn)
		println(ob1)
	}
}