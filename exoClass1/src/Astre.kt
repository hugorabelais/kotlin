sealed class Astre(
    val nom: String,
    val type: String
) {

    data class Etoile(
        val nomEtoile: String,
        val couleur: String,
        val temperatureKelvin: Int
    ) : Astre(nomEtoile, "Étoile")

    data class Planete(
        val nomPlanete: String,
        val diametreKm: Double,
        val nombreSatellites: Int
    ) : Astre(nomPlanete, "Planète")

    data class Comete(
        val nomComete: String,
        val periodeAnnees: Double
    ) : Astre(nomComete, "Comète")

    data class SatelliteNaturel(
        val nomSatellite: String,
        val planeteHote: String
    ) : Astre(nomSatellite, "Satellite")
}


fun decrire(astre: Astre) {
    when (astre) {

        is Astre.Etoile ->
            println("${astre.nom} -> Type : ${astre.type}, Couleur : ${astre.couleur}, Température : ${astre.temperatureKelvin} K")

        is Astre.Planete ->
            println("${astre.nom} -> Type : ${astre.type}, Diamètre : ${astre.diametreKm} km, Satellites : ${astre.nombreSatellites}")

        is Astre.Comete ->
            println("${astre.nom} -> Type : ${astre.type}, Période orbitale : ${astre.periodeAnnees} ans")

        is Astre.SatelliteNaturel ->
            println("${astre.nom} -> Type : ${astre.type}, Orbite autour de : ${astre.planeteHote}")
    }
}


fun main() {

    val soleil = Astre.Etoile(
        "Soleil",
        "Jaune",
        5778
    )

    val sirius = Astre.Etoile(
        "Sirius",
        "Bleu-blanc",
        9940
    )

    val mars = Astre.Planete(
        "Mars",
        6779.0,
        2
    )

    val halley = Astre.Comete(
        "Halley",
        75.3
    )

    val titan = Astre.SatelliteNaturel(
        "Titan",
        "Saturne"
    )

    decrire(soleil)
    decrire(sirius)
    decrire(mars)
    decrire(halley)
    decrire(titan)
}