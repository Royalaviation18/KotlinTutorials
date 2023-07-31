//class in kotlin
class Rectangle(
    //creating a constructor
    val a: Double,
    val b: Double
): Shape("Rectangle") {
    //whenever rectangle class is created, init block will be called first
    init {
        println("$name created with a = $a and b = $b")
    }

    fun area() = a*b

    fun perimeter() = 2* (a+b)

    fun isSquare() = a == b
}