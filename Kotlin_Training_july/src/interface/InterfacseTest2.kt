package `interface`

//bydefaulf interfaces nethods are abstract
//we cannot create object of interface
/*  if any method or constructor is expecting abstract class or interface as an input paramter,
then instead of creating seprate class for an implementation we can create annonymous inner class.  */
//the interfaces are having only one abstract method that is functional interface


interface Bank {
    fun provideloanInfo()

}

fun main() {
    applyForLoan(Axis())
    applyForLoan(SBI())
    applyForLoan(PNB())
    applyForLoan(object :Bank
    {
        override fun provideloanInfo() {
            println("canara Bank provides loan @13.0 ROI")
        }
    })

}


fun applyForLoan(bank: Bank) {

    bank.provideloanInfo()

}

class Axis : Bank {
    override fun provideloanInfo() {
        println("Axis bank provides loan @10.0 ROI")
    }

}

class SBI : Bank {
    override fun provideloanInfo() {
        println("SBI bank provides loan @11.0 ROI")
    }

}

class PNB : Bank {
    override fun provideloanInfo() {
        println("PNB bank provides loan @12.0 ROI")
    }

}