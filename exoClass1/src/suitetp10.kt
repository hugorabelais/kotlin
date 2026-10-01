data class SondeSpatiale(
    val nom: String,
    val orbite: String,
    val autonomieMois: Int
) {

    companion object {

        fun depuisChaine(ligneConfig: String): SondeSpatiale {
            val elements = ligneConfig.split(":")

            val nom = elements[0]
            val orbite = elements[1]
            val autonomieMois = elements[2].toInt()

            return SondeSpatiale(
                nom,
                orbite,
                autonomieMois
            )
        }
    }
}


fun main() {

    val configuration = "Voyager 1:Héliocentrique:600"

    val sonde = SondeSpatiale.depuisChaine(configuration)

    println("Sonde initialisée avec succès : $sonde")
    println()
    println(
        "Nom : ${sonde.nom} | " +
                "Orbite : ${sonde.orbite} | " +
                "Autonomie : ${sonde.autonomieMois} mois"
    )
}