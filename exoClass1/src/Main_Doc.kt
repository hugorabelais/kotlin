
fun main() {

    val bibliotheque = Bibliotheque()

    val livre1 = Livre(
        titre = "Fondation",
        auteur = "Isaac Asimov",
        editeur = "Editions Opta",
        dateParution = "1957",
        quatriemeDeCouverture = "",
        nombrePages = 255
    )

    val livre2 = Livre(
        titre = "Fahrenheit 451",
        auteur = "Ray Bradbury",
        editeur = "Denoël",
        dateParution = "1955",
        quatriemeDeCouverture = "",
        nombrePages = 165
    )



    val photo = Photo(
        titre = "Coucher de soleil",
        auteur = "Robert Doisneau",
        editeur = "Photothèque",
        dateParution = "2026",
        resolutionHorizontale = 1920,
        resolutionVerticale = 1080,
        estCouleur = true
    )

    bibliotheque.ajouterDocument(livre1)
    bibliotheque.ajouterDocument(livre2)
    bibliotheque.ajouterDocument(photo)

    bibliotheque.afficherTout()
}