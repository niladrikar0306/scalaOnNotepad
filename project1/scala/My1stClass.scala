

class My1stClass (real : Double, imaginary : Double) {
	def reWithTypeInferredReturn () = real
	def im () = imaginary
	def reWithExplicitReturn () : Double = real
	def reWithExplicitReturnStatement () : Double = {
		return real
	}
	override def toString() = {
		"" + real + (if (imaginary < 0) "" else "+") + imaginary + "i"
	}
}