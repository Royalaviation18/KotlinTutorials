fun main(){
    //using intArrayOf instead of arrayOf, so we can use vararg feature
    val array = intArrayOf(10,20,25)
    //*array helps in passing as vararg
    val max = getMax(1,2,3,*array,4,9,5,15)
    println("The maximum is $max")
}

//vararg : we can have variable no of arguments and are type of Integers
fun getMax(vararg numbers:Int):Int{
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}