import java.time.LocalDateTime

interface ICorpsCeleste {
    val nom : String
    val magnitude : Double
}

class Planete(override val nom: String, override val magnitude : Double, val distanceSoleil : Double, val dateDecouverte : LocalDateTime) : ICorpsCeleste {


}

fun ICorpsCeleste.estBrillant(): Boolean {
    return magnitude < 1.5
}

fun Planete.toPlaneteJson(): String {
    return "{'nom':'$nom', 'magnitude': $magnitude, 'distance': $distanceSoleil, 'date': $dateDecouverte }"
}

val Planete.estProche: Boolean
    get() = distanceSoleil < 150

fun main() {
    val terre = Planete("Terre", -3.99,149.6, LocalDateTime.parse("2000-01-01T00:00"))
    println("Brillant ?" + terre.estBrillant() +"\n" +
            "JSON : " + terre.toPlaneteJson() + "\n" +
            "Proche du Soleil ? : " + terre.estProche)

}