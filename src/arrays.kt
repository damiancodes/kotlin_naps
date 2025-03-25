fun main(args: Array<String>) {
    val myArray= arrayOf(7,8,8,5,8,5,8,9)
    val myArray2= arrayOf("Kenya", "Burundi", "Uganda", "Kenya", "Ethiopia")

    println(myArray[1])
    println("I was born in ${myArray2[0]}")
    for (i in myArray2){
        println(i)
    }
}