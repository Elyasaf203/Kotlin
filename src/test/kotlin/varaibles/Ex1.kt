package varaibles

object Ex1 {
    @JvmStatic fun main(args:Array<String>) {
        //Print my name and my address
        var myAge = 28
        var mySalary:Long = 15000
        var myAddress = "Migdal Haemek"
        var myName = "Elyasaf Ohayon"
        var myHeight = 1.70
        println("My age is: " + myAge + "\n" + "My address is: " + myAddress + "\n" + "End my name is: " + myName + " My height is: " + myHeight + " My salary is: " + mySalary + "שח ")
        //After change;
        println()
        myAge = 30
        mySalary = 17000
        myAddress = "Tel-aviv"
        myName = "ely"
        myHeight = 1.80
        println("My age is: " + myAge + "\n" + "My address is: " + myAddress + "\n" + "End my name is: " + myName + " My height is: " + myHeight + " My salary is: " + mySalary + "שח ")
    }
}