object CentreControleMaritime {

    private var nombreAlertes = 0

    fun emettreAlerte(message: String) {
        nombreAlertes++
        println("[ALERTE N°$nombreAlertes] ${message.uppercase()}")
    }

    fun afficherBilan() {
        println()
        println("Bilan : Le centre a diffusé un total de $nombreAlertes alerte(s)")
    }
}


fun main() {
    CentreControleMaritime.emettreAlerte("TEMPÊTE DE FORCE 9 SUR LA ZONE IROISE")
    CentreControleMaritime.emettreAlerte("BROUILLARD DENSE DANS L'ESTUAIRE")
    CentreControleMaritime.afficherBilan()
}