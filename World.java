import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

interface Details {
    String getDetails();
}
public class World implements Details {
    private String name;
    public String getName() {
        return name;
    }
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
            continents[i] = new Continent("Continent" + (i +1), this);
        }
    }

    // Print continent details from World object
    public void printContinents() {
        for (Continent continent : continents) {
            continent.getDetails();
        }
    }

    public String getDetails() {
        return("World Name: " + this.getName());
    }


}

class Continent implements Details {

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

    public String getDetails() {
        return("Continent: " + name + " Belongs to: " + world.getName());
    }

    private void createNations() {
        Random random = new Random();
        int numberOfNations = random.nextInt(8) + 2;
        nations = new Nation[numberOfNations];
        for (int i = 0; i < numberOfNations; i++) {
            nations[i] = new Nation("Nation" + (i +1), this);
        }
    }

    public ArrayList<Nation> getNations() {
        return new ArrayList<>(Arrays.asList(nations));
    }

}

class Nation implements Details {
    private String name;
    public String getName() {
        return name;
    }
    private Province[] provinces;

    private Continent continent;

    public Nation(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
        this.createProvinces();
    }

    public String getDetails() {
        return("Nation: " + name + " Belongs to: " + continent.getName());
    }

    private void createProvinces() {
        Random random = new Random();
        int numberOfProvinces = random.nextInt(8) + 2;
        provinces = new Province[numberOfProvinces];
        for (int i = 0; i < numberOfProvinces; i++) {
            provinces[i] = new Province("Province" + (i +1), this);
        }
    }

    public ArrayList<Province> getProvinces() {
        return new ArrayList<>(Arrays.asList(provinces));
    }
}

class Province implements Details {
    private String name;
    public String getName() {
        return name;
    }

    private City[] cities;

    private Nation nation;

    public Province(String name, Nation nation) {
        this.name = name;
        this.nation = nation;
        this.createCities();
    }

    public String getDetails() {
        return("Province: " + name + " Belongs to: " + nation.getName());
    }

    private void createCities() {
        Random random = new Random();
        int numberOfCities = random.nextInt(9) + 1;
        cities = new City[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            cities[i] = new City("City" + (i +1), this);
        }
    }

    public ArrayList<City> getCities() {
        return new ArrayList<>(Arrays.asList(cities));
    }

}

class City implements Details {
    private String name;
    public String getName() {
        return name;
    }

    private Quarter[] quarters;

    private Province province;

    public City(String name, Province province) {
        this.name = name;
        this.province = province;
        this.createQuarters();
    }

    public String getDetails() {
        return("City: " + name + " Belongs to: " + province.getName());
    }

    private void createQuarters() {
        Random random = new Random();
        int numberOfQuarters = random.nextInt(4) + 2;
        quarters = new Quarter[numberOfQuarters];
        for (int i = 0; i < numberOfQuarters; i++) {
            quarters[i] = new Quarter("Quarter" + (i +1), this);
        }
    }
    public ArrayList<Quarter> getQuarters() {
        return new ArrayList<>(Arrays.asList(quarters));
    }

}

class Quarter implements Details {

    private String name;
    public String getName() {
        return name;
    }

    private City city;

    public Quarter(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getDetails() {
        return("Quarter: " + name + " Belongs to: " + city.getName());
    }
}