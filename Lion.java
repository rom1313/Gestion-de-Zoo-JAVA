public class Lion extends Animal {
    public int getLongeurCriniere() {
        return longeurCriniere;
    }

    public void setLongeurCriniere(int longeurCriniere) {
        this.longeurCriniere = longeurCriniere;
    }

    private int longeurCriniere;




    public Lion(String race, String nom,int longueurCriniere) {
        super(race, nom);
        this.longeurCriniere=longueurCriniere;
        this.setRegimeAlimentaire("Carnivore");
        this.setRepasKilos(3);
    }

}
