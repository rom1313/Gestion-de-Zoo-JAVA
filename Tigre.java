public class Tigre extends Animal {
    int nbrayures;


    public Tigre(String race, String nom, int nbrayures) {
        super(race, nom);
        this.nbrayures=nbrayures;
        this.setRegimeAlimentaire("Carnivore");
        this.setRepasKilos(5);
    }
}
