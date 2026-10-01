import kotlin.math.abs

fun calculer(x: Double, f: (Double) -> Double): Double {
    return f(x)
}

fun repeter(fois: Int action(Int) -> Unit){
    for (i in
}

fun main(){
    println(calculer(x=3.5){x : Double -> x*x})
    println(calculer(x=2.0){x : Double -> x*x*x})
    println(calculer(x=4.0){x : Double -> 1/x})
    println(calculer(x=7.2){x : Double -> -x})
    println(calculer(x=-6.5){x : Double -> abs(x)})
}