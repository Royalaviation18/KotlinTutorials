fun main(){
    //inheritance
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("Rohit")
    println(myCircle1.name)
    println("----------------------------")
    val myTriangle = Triangle(2.0,4.0,6.0)
    myTriangle.changeName("Mohit")
    println(myTriangle.name)
    println("----------------------------")
    val myRectangle = Rectangle(4.0,8.0)
    myRectangle.changeName("Bengaluru")
    println(myRectangle.name)
}