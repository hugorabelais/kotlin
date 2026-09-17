fun main(){
        try {
            val frac1 = Fraction(1, 2)
            val frac2 = Fraction(1, 3)

            println(frac1+frac2)
            println(frac1-frac2)
            println(frac1*frac2)
            println(-frac1)
        } catch (e: IllegalArgumentException) {
            println("Erreur : ${e.message}")
        }

}