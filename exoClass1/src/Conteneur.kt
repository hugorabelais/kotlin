class Conteneur<T> (val contenue : T, val poids : Double){
    var masse : Double = poids
        private set (valeur){
            field = valeur
        }

    fun ajouterPoids(poidsAjouter : Double){
        masse += poidsAjouter
    }

    override fun toString(): String {return "Conteneur [Armorique Shipping] -> Contenu : $contenue | Poids total : $poids tonnes"}

}
