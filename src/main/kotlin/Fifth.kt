fun main(){
    //when
    println("Enter your age:")
    val age = readLine()?.toInt()
    when(age){
        in 0..5 -> println("You are a yong kid")
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you're 18")
        19,20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're really old")
    }

    println("Where are you from?:")
    val uCountry = readLine()?.toString()
    when(uCountry){
        "India" -> println("Namaste")
        "Germany"-> println("Hallo")
        "USA"-> println("Hello")
        "Russia"-> println("privet")
        else -> println("I don't know that")
    }
}

