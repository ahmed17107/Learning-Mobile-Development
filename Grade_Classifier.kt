fun main(){
    var score = readln().toInt()
    while (score !in 0..100){
        println("Invalid input....Try Again or press -1 to exit")
        score = readLine()!!.toInt()
        if (score == -1) return
    }
    when(score){
        in 90..100 -> println("A Excellent")
        in 80..89 -> println("B Good")
        in 70..79 -> println("C Average")
        else -> println("F Needs Work")
    }
}