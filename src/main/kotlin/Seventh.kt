fun main(){
    //using intArrayOf instead of arrayOf, so we can use vararg feature
    val array = intArrayOf(10,20,25)
    //*name of the val(array in this case) helps in passing as vararg
    val max = getMax(1,2,3,*array,4,9,5,15)
    println("The maximum is $max")
    //using default arguments i.e. Google in this case
    searchFor("How to become a good programmer")
    //passing our custom argument
    searchFor("How to become the best kotlin programmer","Bing")
    searchFor(search = "How to become the best Android Engineer", searchEngine = "Yahoo")
    //this also works
    searchFor(searchEngine = "McAfee", search = "How to become a good human")

    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")

}

//function with default arguments
fun searchFor(search: String,searchEngine: String = "Google"){
    println("Searching for '$search' on $searchEngine")
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

fun alternatingSum(vararg numbers: Int):Int{
    var pSum = 0
    var nSum = 0
    var sum = numbers[0]
    for(number in numbers){
        if(numbers[number]%2==0){
            pSum += number
        }
        else {
            nSum +=number
        }
    }
    sum = pSum - nSum
    return  sum
}