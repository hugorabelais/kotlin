class Bibliotheque {

    private val catalogue = ArrayList<IDocument>()

    fun ajouterDocument(doc: IDocument) {
        catalogue.add(doc)
    }

    fun afficherTout() {
        for (document in catalogue) {
            println(document.afficherDetails())
        }
    }
}