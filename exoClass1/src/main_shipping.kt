fun main(){
    val boisson = CaisseBoisson(appelation = "Cidre Artisanal Brut", volume = 750.0)
    val materiel = MaterielInformatique(designation = "Rack serveur Blade", assembleur = "SRV-2026-X")
    val cont : Conteneur<CaisseBoisson> = Conteneur(contenue = boisson, poids = 5.0)
    val cont1 : Conteneur<MaterielInformatique> = Conteneur(contenue = materiel, poids = 3.0)
    println(cont)
    println(cont1)


}