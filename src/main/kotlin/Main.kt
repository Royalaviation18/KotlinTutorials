import kotlin.math.pow

fun main(){
    println("Hello World")
    println("Whats up?")

    var myVariable = 5
    //printing variable data
    println("The value of our variable is $myVariable")
    // changing the value of my variable
    myVariable = 10
    println("The value of our variable is " +myVariable)
    val  mySecondVariable = 10
    println("The value of val datatype can't be changed and the current value is " +mySecondVariable)
    //boolean
    var myBoolean = true
    println(myBoolean)

    var x = 15
    var y = 7
    var fResult= 15 + 7 //this works too
    println(fResult)
    //performing arithmetic operation
    val result = x - y
    println(result)
    println(15 * 7) //this works too
    var a = 16
    var b = 8
    println("The result of x/y is " +a/b)
    println("The result of a+b is: ${a + b}")
    a += 10
    println("The result of a+b is now: ${a + b}")

    //Float
    //for more accuracy use float
    var v: Float = 20.15F //F here stands for float
    var w = 8.0 //Double
    println("The result of v/w is : " +v/w)

    //calculating the volume of a sphere
    println("For calculating the volume of sphere, we are using the formula : 0.75 *pi * radius^3")
    var radius = 5.5
    //Using Math.pow for calculating the power
    println("The volume of the sphere with the radius 5.5 is : " +0.75*3.14* 5.5.pow(3.0))
    val uName = "royalAviation18"
    println("The user logged in: $uName")
    //using .inside $ for string, we can use the string functions
    println("Our string length is: ${uName.length}")
    //reversing the string
    println(uName.reversed())

    val t = 4
    val u = 5
    //compares both the integers
    println(t == u)
    println(t <= u )
    println(t != u )
    b = 26
    println(t == u && a == b)
    println( t == u || a == b)
    println(3>4 || 4 >3 && 4<=4) //true
    val bool = true
    x = 9
    y =3
    var z =9
    val hardExpression = !(x!= z) && bool || z > (x+y) && (!bool || y < z)
    //true
    println(hardExpression)

    //we can specify as many as else if statements, but only 1 if and else statement
    x = 7
    y = 7
    z = if(x + y == 14) 3 else 4 // for assigning value to z

   //if there is only one command after the if/else or else if then
    //brackets are not required
    if(x < y || y * y ==49){
        println("Atleast one of the condition is true")
    } else if(x > y)
        println("x is greater than y")
     else{
        println("x is equal to y")
    }
    println("the value of z is $z")

    val string = "radar"

    if(string.reversed() == string)
        println("The string is a palindrome")
    else
        println("The string is not a palindrome")

    val userInput = readLine()
    println("You entered $userInput")
    println(userInput?.toUpperCase()) // have to ? as the value can be null
    println("Enter a number")
    val userNumber = readLine()
    if(userNumber != null)
        
        println(userNumber.toInt()-5)

    println("Enter your age")
    val userAge = readLine()?.toInt()
    if(userAge !=null)
        if(userAge<18)
            println("You are not yet adult")
        else if(userAge>18 && userAge<61)
            println("You are an adult")
        else
            println("You are really too old, please take care")






}