class Compositeur(val nom : String, val anneeNaissance : Int, var anneeDeces : Int){
    var anneeDecesFinal : Int = anneeDeces
        set (valeur){
            if (anneeDeces>anneeDecesFinal){
                field = valeur
            }
        }
}