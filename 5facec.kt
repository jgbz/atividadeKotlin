package calc

fun main() {
    verifier(7)
}

fun verifier(arg: Int){
    if (arg%3 == 0 && arg%5 == 0){
       println("Facec") 
    } else if (arg%3 == 0){
       println("Fa") 
    } else if (arg%5 == 0){
       println("Cec") 
    } else{
       println(arg)
    }
}