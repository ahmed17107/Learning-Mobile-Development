fun main(){
    var name:String = readLine()!!
    var nickname:String? = readLine()
    var age:Int = readLine()!!.toInt()
    println("Nickname: ${nickname ?: "No nickname"}")
    if (age >= 18) println("Adult")
    else println("Minor")
}