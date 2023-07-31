class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shape("Triangle") {
    init {
        //$name is declared in parent class Shape
        println("$name created a = $a, b = $b , and c = $c")
        println("Area of $name ${area()}")
        println("Perimeter of $name ${perimeter()}")
    }

    fun area() = 0.5 * b * c

    fun perimeter() = a + b +c

}