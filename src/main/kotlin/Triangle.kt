class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shape("Triangle") {
    init {
        println("$name created a = $a, b = $b , and c = $c")
        println("Area of the triangle ${area()}")
        println("Perimeter of the triangle ${perimeter()}")
    }

    fun area() = 0.5 * b * c

    fun perimeter() = a + b +c

}