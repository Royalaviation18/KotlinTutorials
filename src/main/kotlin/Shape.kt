//open means this class be inherited from
open class Shape(
    var name : String
) {
    init {
        //in this case is shape class, as triangle,rectangle and circle as child class
        println("I am the super class!")
    }
    fun changeName(newName: String){
        name = newName
    }

}