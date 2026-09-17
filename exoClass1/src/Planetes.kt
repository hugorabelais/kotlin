class Planetes(val nom: String, val masse: Double, val rayon : Double, val distanceSoleil : Double)

{
    init {
        require(masse > 0 && rayon >0 && distanceSoleil>0) { "la masse la distance ou le rayon ne peuvent pas etre negative" }
    }

        override fun toString() = " $nom -> Masse : $masse M terrestre(s), Rayon : $rayon km, Distance : $distanceSoleil UA"

}

