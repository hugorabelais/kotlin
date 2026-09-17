fun main() {
    try {
        val terre = Planetes("Terre ", 1.0, 6371.0 , distanceSoleil = 1.0)
        val mars = Planetes("mars ", 0.11, 3389.5 , distanceSoleil = 1.52)
        val jupiter = Planetes("Jupiter  ", 317.8, 69911.0 , distanceSoleil = 5.2)
        val nul = Planetes("nul  ", 12.0, -69911.0 , distanceSoleil = 5.2)
        println(terre)
        println(mars)
        println(jupiter)
        println(nul)
    } catch (e: IllegalArgumentException) {
        println("Erreur : ${e.message}")
    }

}   