public abstract class Animal extends Zoo {
    private String race;
    private String nom;
    private String regimeAlimentaire;
    private int repasKilos;

    public Animal(String race,String nom){
        this.race=race;
        this.nom=nom;
    }

public void ficheAnimal(){
    String regime = this.getRegimeAlimentaire();
    String regimenom;
        if (regime == "Carnivore"){
             regimenom="viande";
            System.out.println(this.getNom());
            System.out.println(this.getRace());
            System.out.println(this.getRegimeAlimentaire());
            System.out.println(this.getRepasKilos() + " Kilo(s) de"+" "+regimenom+"/jour");
        }else if (regime=="Végétarien"){
             regimenom="fruits";
            System.out.println(this.getNom());
            System.out.println(this.getRace());
            System.out.println(this.getRegimeAlimentaire());
            System.out.println(this.getRepasKilos() + " Kilo(s) de"+" "+regimenom+"/jour");
        }

    }



    //todo getter et setter

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    public int getRepasKilos() {
        return repasKilos;
    }

    public void setRepasKilos(int repasKilos) {
        this.repasKilos = repasKilos;
    }
}
