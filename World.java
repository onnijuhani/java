import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

interface Details {
    String getDetails(); //tuo nimen ja mihin yläluokkaan se kuuluu
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

abstract class Area {
    String name;

    abstract ArrayList getContents();
    abstract String getName();
}

public class World extends Area implements Details {
    private String name;
    @Override
    public String getName() {
        return this.name;
    }
    private Continent[] continents;

    private Size size;

    @Override
    public ArrayList<Continent> getContents() {
        return new ArrayList<>(Arrays.asList(continents));
    }

    public World(String name, Size size){
        this.name = name;
        this.size = size;
        this.createContinents();
    }



    // Method to create random number of continents
    private void createContinents() {
        Random random = new Random();
        int numberOfContinents = size == size.SMALL ? 2 : size == size.MEDIUM ? 4 : size == size.LARGE ? 6 : -1;
        continents = new Continent[numberOfContinents];
        for (int i = 0; i < numberOfContinents; i++) {
            continents[i] = new Continent(NameCreation.generateContinentNames(), this);
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

class Continent extends Area implements Details {

    private String name;
    @Override
    public String getName() {
        return this.name;
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
        int numberOfNations = random.nextInt(3) + 1;
        nations = new Nation[numberOfNations];
        for (int i = 0; i < numberOfNations; i++) {
            Orientation styleName = random.nextInt(2) == 0 ? Orientation.Imperial : Orientation.Democratic;
            Style style = new Style(styleName); //uusi style objekti nation luontia varten
            nations[i] = new Nation(NameCreation.generateNationName(styleName), this, style);
        }
    }

    @Override
    public ArrayList<Nation> getContents() {
        return new ArrayList<>(Arrays.asList(nations));
    }

}

class Nation extends Area implements Details {
    private String name;
    @Override
    public String getName() {
        return this.name;
    }
    private Province[] provinces;
    private Style style; //Style luokka
    public Orientation orientation; //nimi
    private Continent continent;

    public Nation(String name, Continent continent, Style style ) {
        this.name = name;
        this.continent = continent;
        this.style = style;
        this.orientation = style.getName();
        this.createProvinces();
    }

    public String getDetails() {
        return(orientation + " " + "Nation: " + name + " Belongs to: " + continent.getName());
    }

    private void createProvinces() {
        Random random = new Random();
        int numberOfProvinces = random.nextInt(8) + 2;
        provinces = new Province[numberOfProvinces];
        for (int i = 0; i < numberOfProvinces; i++) {
            provinces[i] = new Province(NameCreation.generateProvinceName(orientation), this);
        }
    }
    @Override
    public ArrayList<Province> getContents() {
        return new ArrayList<>(Arrays.asList(provinces));
    }
}

class Province extends Area implements Details {
    private String name;
    @Override
    public String getName() {
        return this.name;
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
        int numberOfCities = random.nextInt(4) + 1;
        cities = new City[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            cities[i] = new City(NameCreation.generateCityName(nation.orientation), this);
        }
    }
    @Override
    public ArrayList<City> getContents() {
        return new ArrayList<>(Arrays.asList(cities));
    }

}

class City extends Area implements Details {
    private String name;
    @Override
    public String getName() {
        return this.name;
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
        int numberOfQuarters = random.nextInt(3) + 2;
        ArrayList<String> names = NameCreation.generateQuarterNames(numberOfQuarters);
        quarters = new Quarter[numberOfQuarters];
        for (int i = 0; i < numberOfQuarters; i++) {
            quarters[i] = new Quarter(names.get(i), this);
        }
    }
    @Override
    public ArrayList<Quarter> getContents() {
        return new ArrayList<>(Arrays.asList(quarters));
    }

}

class Quarter extends Area implements Details {

    private String name;
    @Override
    public String getName() {
        return this.name;
    }

    private City city;

    public Quarter(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getDetails() {
        return("Quarter: " + name + " Belongs to: " + city.getName());
    }
    @Override
    public ArrayList<Quarter> getContents() {
        return new ArrayList<>();
    }
}