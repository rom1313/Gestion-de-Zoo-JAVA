import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> basededonneesZoo = new ArrayList<Animal>();

    public void ajouterAnimal(Animal animal) {
        basededonneesZoo.add(animal);
    }

    public int viandeprixKilo(int kiloviande) {
        int prixkilo = 10;

        kiloviande *= prixkilo;

        return kiloviande;

    }

    public int fruitprixKilo(int kilofruit) {

        int prixkilo = 1;

        kilofruit *= prixkilo;

        return kilofruit;

    }

    public int calculprixrepas(Animal animal) {
        int prix = 0;
        if (animal.getRegimeAlimentaire() == "Carnivore") {
            prix = this.viandeprixKilo(animal.getRepasKilos());

        }
        else if (animal.getRegimeAlimentaire() == "Végétarien") {
            prix = this.fruitprixKilo(animal.getRepasKilos());

        }
        return prix;
    }

    public int calculCoutduZoo(){
        int total=0;
        for (Animal i:basededonneesZoo){
            int cout = calculprixrepas(i);
            total+=cout;
            System.out.println(cout);
        } return total;}



}

