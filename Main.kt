fun main() {
greetings("Shalom")
    modulus(37,6)
    addition(34,45.98,54,56.999)
    interestingFact("singing")

}
fun greetings(name: String){
    println("Hello ${name}")
}
fun modulus(num1: Int, num2: Int): Int{
    var remainder= num1%num2
    println(remainder)
    return remainder
}
fun addition(num3: Int, num4: Double, num5:Int, num6: Double): Double{
    var sum= num3+num4+num5+num6
    println(sum)
    return sum
}
fun interestingFact(fact: String){
    println("I love  ${fact}")
}

