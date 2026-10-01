package test

// 1. Classe mère scellée représentant les types d'étoiles
sealed class TypeEtoile(
    val nom: String,
    val couleur: String
) {

    // Étoile géante bleue
    object O : TypeEtoile("Supergéante Bleue", "Bleu") {
        fun decrireTemperature() {
            println("Température extrême : > 30 000 °C")
        }
    }

    // Étoile de type Soleil
    object G : TypeEtoile("Naine Jaune", "Jaune") {
        fun decrireTemperature() {
            println("Température modérée : ~ 5 500 °C")
        }
    }

    // Étoile froide
    object M : TypeEtoile("Naine Rouge", "Rouge") {
        fun decrireTemperature() {
            println("Température basse : < 3 700 °C")
        }
    }
}


// 2. Programme principal
fun main() {

    // Déclaration-Affectation :
    // On stocke l'objet unique représentant le type G
    val etoileObservee = TypeEtoile.G

    // Affichage des propriétés héritées
    println("Classification : ${etoileObservee.nom}")
    println("Couleur dominante : ${etoileObservee.couleur}")
    print("Caractéristique thermique : ")

    // Grâce au mot-clé "sealed", le when est exhaustif
    when (etoileObservee) {
        TypeEtoile.O -> TypeEtoile.O.decrireTemperature()
        TypeEtoile.G -> TypeEtoile.G.decrireTemperature()
        TypeEtoile.M -> TypeEtoile.M.decrireTemperature()
    }
}