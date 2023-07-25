fun main(){
    //Extension Function
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null){
        //Extension function called, as we have created the function below 'isPrime'
        if(input.isPrime()){
            println("$input is a prime number")
        }
        else{
            println("$input is not a prime number")
        }
    }

    val nList = listOf(1,2,3,4,5,6)
//    nList.theMultiply()


}


//this type of function is called as extension function
//fun then the type of variable (Int as per line number 3), also we
//are not passing parameters

// for accessing the number passed here we would use 'this'
//keyword in the function
fun Int.isPrime(): Boolean{
    for(i in 2 until this - 1){
        if(this % i == 0){
            return false
        }
    }
    return true
}

//fun Int.theMultiply(): Int{
//    var product = this[0]
//    for (i in this){
//        product *= i
//    }
//}