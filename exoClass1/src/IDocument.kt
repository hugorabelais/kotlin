interface IDocument {
    val titre: String
    val auteur: String
    val editeur: String
    val dateParution: String

    fun afficherDetails(): String
}