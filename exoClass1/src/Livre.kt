class Livre(
    override val titre: String,
    override val auteur: String,
    override val editeur: String,
    override val dateParution: String,
    val quatriemeDeCouverture: String,
    val nombrePages: Int
) : IDocument {

    override fun afficherDetails(): String {
        return "Livre : $titre, écrit par $auteur, publié par $editeur en $dateParution. ($nombrePages pages)"
    }
}