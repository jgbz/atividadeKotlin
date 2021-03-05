package calc

fun main() {
    calculadora("+", 4.0, 4.0)
    calculadora("-", 4.0, 4.0)
    calculadora("*", 4.0, 4.0)
    calculadora("/", 4.0, 4.0)
}

fun calculadora(arg: String, arg2: Double, arg3: Double){
    if (arg.equals("+")){
        println(arg2+arg3);
    }
    if (arg.equals("-")){
        println(arg2-arg3);
    }
    if (arg.equals("*")){
        println(arg2*arg3);
    }
    if (arg.equals("/")){
        println(arg2/arg3);
    }
}