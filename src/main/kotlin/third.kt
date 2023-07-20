fun main(){
    val myArray = arrayOf(1,2,3)
    for(i in myArray){
        println(i)
    }
    println("-----")
    //creating a range
    for(i in 5..10){
        println(i)
    }
    println("-----")
    for(i in 10 downTo 5 step 2)
        println(i)
    println("-----")
    for(i in 'a'..'z' step 5)
        println(i)

    //printing the max element in an array
    val mySArray = arrayOf(4,5,8,9,10,2,3)
    var max = myArray[0]
    for(i in mySArray){
        if(i>max)
            max = i
    }
    println("The highest element in the array is $max")

    //printing the sum of the array
    val myTArray = arrayOf(4,5,9,10,3,8)
    var sum = 0
    for(i in myTArray){
        sum += i
    }
    println("The sum of the array is $sum")

    //printing the average of the numbers entered by user
    println("Enter 5 numbers")
    var avg = 0.0
   for(i in 1..5){
       var input= readLine()?.toInt()
       if(input !=null)
           avg +=input/5.0
   }
    println("The average value is $avg")

}
