class Photo(
    override val titre: String,
    override val auteur: String,
    override val editeur: String,
    override val dateParution: String,
    val resolutionHorizontale: Int,
    val resolutionVerticale: Int,
    val estCouleur: Boolean
) : IDocument {

    override fun afficherDetails(): String {
        return "Photo : $titre par $auteur. Résolution: $resolutionHorizontale x $resolutionVerticale px, ${if (estCouleur) "couleur" else "pas couleur"}"
    }
}