fun main(){
    //functions
    val x = 3
    val y = 3
    printThreeLines()
    val pow = printPow(x,y)
    println("the result from the power function is $pow")
    println("Enter a number:")
    val uNum = readLine()?.toInt()
    if(uNum != null)
        printSum(uNum)
    println(multiply(3,5))
    val list = listOf(1,2,3)
    println(printFirstItem(list))

    val sList = listOf(3,2,5,1,5,6,7)
    println(sList)
    println("Search for a number:")
    val uNumber = readLine()?.toInt()
    if(uNumber != null)
        searchForAnItem(sList,uNumber)

}

fun searchForAnItem(list: List<Int>, n:Int){

    for(i in list){
        if(i == n){
            println("The index of $n is $list[i]")
        }
        else
            println("The index of $n is -1")
    }
}

//function to pass a list in a function
fun printFirstItem(list: List<Int>) = println(list[0])

//return in a single line, if the function has only statement
fun multiply(a:Int, b:Int) = a*b

//this function will return an Int
fun printPow(base: Int, exponent:Int): Int{
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
//    println("$base to the power of $exponent is $result")
    return result

}

fun printThreeLines(){
    println("First")
    println("Second")
    println("Third")
}


fun printSum(n:Int){
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    println("The sum of the values from 1 to $n is $sum")
//    return sum
}