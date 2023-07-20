
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
    println("Enter 10 elements:")
    val sList = mutableListOf<Int>()
    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null)
            sList.add(x)
    }
    for(i in sList.reversed())
        println(i)

    println("Enter a number n>1:")
    val num = readLine()?.toInt()
    var next = 0
    var next2 = 1
    val tList = mutableListOf<Int>()
    if(num != null)
        tList.add(next)
        tList.add(next2)
       //complete tomorrow



}