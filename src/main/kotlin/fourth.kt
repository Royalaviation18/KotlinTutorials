
fun main(){
    //lists

    val array = arrayOf(1,2,3) //values of array can be changed during runtime
    //list values are immutable
    val list = listOf(1,2,3) //values of lists can't be changed during runtime
    //array values can be changed
    array[0] = 3
    //mutable list
    val mList = mutableListOf(1,2,3)    //mutable list can also be changed
    println(mList)
    mList.add(4)
    println(mList)
    //removing values from list
    //remove function removes that element
    mList.remove(3)
    println(mList)
    //removeAt function removes value from the index
    mList.removeAt(0)
    println(mList)
    println("-----")
    println("Enter 5 elements:")
    val sList = mutableListOf<Int>()
    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null)
            sList.add(x)
    }
    println("The 5 numbers in reverse order are:")
    for(i in sList.size  downTo 1){
        println(i)
    }
//    for(i in sList.reversed())
//        println(i)

    println("Enter a number n>1:")
    val num = readLine()?.toInt()
    val tList = mutableListOf(0,1)
    if(num !=null){
        for(i in 2..num-1){
            tList.add(tList[i-2]+tList[i-1])
        }
    }
    println(tList)


}