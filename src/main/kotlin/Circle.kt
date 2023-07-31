class Circle (
    val radius: Double
): Shape("Circle"){
    val pi = 3.141592
    init {
        println("The $name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * pi

    fun perimeter() = 2 * radius * pi
}