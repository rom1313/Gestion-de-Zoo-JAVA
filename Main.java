public class Main {




    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Lion simba = new Lion("lion", "Simba", 20);
        Orang_outan joe = new Orang_outan("Chimpanzé", "Joe");
        zoo1.ajouterAnimal(simba);
        zoo1.ajouterAnimal(joe);
        System.out.println(zoo1.calculCoutduZoo());

    }


}
