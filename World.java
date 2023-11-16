import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class World {
    private String name;
    private Continent[] continents;

    public ArrayList<Continent> getContinents() {
        return new ArrayList<>(Arrays.asList(continents));
    }

    public World(String name){
        this.name = name;
        this.createContinents();
    }

    // Method to create random number of continents
    private void createContinents() {
        Random random = new Random();
        int numberOfContinents = random.nextInt(3) + 2;
        continents = new Continent[numberOfContinents];
        for (int i = 0; i < numberOfContinents; i++) {
            continents[i] = new Continent("Continent " + (i +1), this);
        }
    }

    // Print continent details from World object
    public void printContinents() {
        for (Continent continent : continents) {
            continent.printContinentDetails();
        }
    }



}

class Continent {

    private String name;
    public String getName() {
        return name;
    }
    private World world;
    private Nation[] nations;

    // Constructor for Continent
    public Continent(String name, World world) {
        this.name = name;
        this.world = world;
        this.createNations();
    }

    // Getters and setters...

    public void printContinentDetails() {
        System.out.println("Continent: " + name);
    }

    private void createNations() {
        Random random = new Random();
        int numberOfNations = random.nextInt(8) + 2;
        nations = new Nation[numberOfNations];
        for (int i = 0; i < numberOfNations; i++) {
            nations[i] = new Nation("Nation " + (i +1), this);
        }
    }

}

class Nation {
    private String name;

    private Continent continent;

    public Nation(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    public void printNationDetails() {
        System.out.println("Nation: " + name);
    }



}