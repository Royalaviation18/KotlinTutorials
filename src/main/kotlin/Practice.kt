fun main(){
    val list = listOf(1,2,3,4,5,6)
    println(list)
    println("Enter number to be searched:")
    val number = readLine()?.toInt()
    if(number != null)
        println("The index of $number is ${indexOf(list,number)}")
}

fun indexOf(list: List<Int>,number: Int):Int{
    for(i in 0..list.size-1){
        if(list[i]== number)
            return i
    }
    return -1
}