fun main() {
    //Array demonstration
    val myArray = arrayOf(3, 2, 6, 4)
    val mySArray = arrayOf("hello", "guys", "whats up?")
    //technically this is also possible
    val mixArray = arrayOf("hello", 3) //but not advised
    //prints type of array and its location
    println(myArray)
    println(mySArray[1])
    println("------")
    //while loops
    var x = 3
    while (x > 0) {
        println("hello")
        x--
    }
    println("------")
    val myTArray = arrayOf("Hey", "Folks", "All good?")
    val arrayLength = myTArray.size
    var i = 0
    while (i < arrayLength) {
        println(myTArray[i])
        i++
    }

    println("Please enter a number")
    var myNumber = readLine()?.toInt()
    println("Lets count from $myNumber down to 0")
    while (myNumber != null && myNumber >= 0) {
        println(myNumber)
        myNumber--
    }





    println("Enter number 1:")
    val firstNumber = readLine()?.toInt()
    println("Enter number 2:")
    val secondNumber = readLine()?.toInt()

    var result = 1
    i = 0
    while(firstNumber!= null && secondNumber !=null && i<secondNumber){
        result *= firstNumber
        i++
    }
    println("$firstNumber to the power of $secondNumber is $result")
}