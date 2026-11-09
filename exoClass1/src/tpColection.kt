data class Observation(
    val objet: String,
    val temperatureK: Int,
    val typeSpectral: String,
    val estValide: Boolean
)

fun main() {

    val fluxDonnees = listOf(
        Observation("Etoile-A", 5500, "G", true),
        Observation("Etoile-B", 3000, "M", false),
        Observation("Etoile-C", 12000, "B", true),
        Observation("Etoile-D", 4500, "K", true),
        Observation("Etoile-E", 25000, "O", true)
    )

    val ciblesPrioritaires = fluxDonnees.filter {
        it.estValide && it.temperatureK > 5000
    }

    ciblesPrioritaires.forEach {
        if (it.temperatureK > 10000) {
            println("Priorité Haute : ${it.objet} (${it.typeSpectral}) détectée.")
        } else {
            println("Analyse standard : ${it.objet} (${it.typeSpectral}) en cours.")
        }
    }
}