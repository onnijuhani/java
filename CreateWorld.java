import java.util.ArrayList;


public class CreateWorld {

    public static void main(String[] args) {

        //insert name of the world, and size either small medium or large
        World world = new World("Medium World", Size.LARGE);

        Property property = PropertyCreation.createProperty("Iron Legion Conclave", "Province");
        King king = new King();
        Authority authority = new NationAuthority(property, king);
        System.out.println(authority.getAuthorityType());

        System.out.println(property.getName());

        Time time = new Time();        String glock = time.getClock();
        int days = 5000;
        for (int i = 0; i < days; i++){
            time.incrementDay();
        }
        glock = time.getClock();
        System.out.println(glock);




        int objectCount = 0;

        ArrayList<Continent> continents = world.getContents();
        for (Continent continent : continents) {
            System.out.println("\n");
            System.out.println("Continent:");
            objectCount++; // Increment for the continent
            ArrayList<Nation> nations = continent.getContents();
            System.out.println(continent.getName());
            for (Nation nation : nations) {
                objectCount += 3; // Increment for the nation
                ArrayList<Province> provinces = nation.getContents();
                System.out.println("\t" + "Nation:");
                System.out.println("\t" + nation.getName());
                System.out.println("\tAuthority Figure: " + nation.authority.getAuthorityType() +" In a: "+ nation.authority.getPropertyType());
                for (Province province : provinces) {
                    objectCount += 3; // Increment for the province
                    ArrayList<City> cities = province.getContents();
                    System.out.println("\t\t" + "Province:");
                    System.out.println("\t\t" + province.getName());
                    System.out.println("\t\tAuthority Figure: " + province.authority.getAuthorityType() +" In a: "+ province.authority.getPropertyType());
                    for (City city : cities){
                        objectCount += 3; // Increment for the city and its property
                        System.out.println("\t\t\t" + "City:");
                        System.out.println("\t\t\t" + city.getName());
                        System.out.println("\t\t\tAuthority Figure: " + city.authority.getAuthorityType() +" In a: "+ city.authority.getPropertyType());
                        ArrayList<Quarter> quarters = city.getContents();
                        for (Quarter quarter : quarters){
                            objectCount += 3; // Increment for the quarter and its property
                            System.out.println("\t\t\t\t" + quarter.fullHierarchyInfo());
                            System.out.println("\t\t\t\tAuthority Figure: " + quarter.authority.getAuthorityType() +" In a: "+ quarter.authority.getPropertyType());
                        }
                    }
                }
            }
        }

        System.out.println("Total objects printed: " + objectCount);

    }
}
