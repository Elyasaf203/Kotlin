package varaibles

object Ex7 {
    @JvmStatic fun main(args:Array<String>) {
        val radios = 10
        val pi = 3.14159265
        val rectangleHeight = 10
        val rectangleWidth = 5.15
        val resultsCircle = (pi * radios) * radios
        val resultsRectangle = rectangleHeight * rectangleWidth
        println("The area for circle is: $resultsCircle")
        println("The area for rectangle is: $resultsRectangle")
        println("The area for circle is: $resultsCircle The area for rectangle is: $resultsRectangle")
    }
}