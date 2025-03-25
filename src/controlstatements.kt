fun main(args: Array<String>) {
    print("Enter a number :")
    val num =Integer.valueOf(readln())
    if (num%2==0){
        println("$num is even number")
    }
    else{
        println("$num is odd number")
    }



    print("Enter age: ")
    val age =Integer.valueOf(readln())
    if (age >= 18){
        println("$age is eligible to vote")

    }
    else{
        println("$age is not eligible to vote")
    }
}