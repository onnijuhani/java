import java.util.ArrayList;


public class CreateWorld {

    public static void main(String[] args) {

        //insert name of the world, and size either small medium or large
        World world = new World("Medium World", Size.MEDIUM);
        Continent continent1 = world.getContents().get(1);

        Access.printNames(continent1);

        Time time = new Time();
        String glock = time.getClock();
        int days = 5000000;
        for (int i = 0; i < days; i++){
            time.incrementDay();
        }
        glock = time.getClock();
        System.out.println(glock);








//        ArrayList<Continent> continents = world.getContents();
//        for (Continent continent : continents) {
//            System.out.println("\n");
//            System.out.println("Continent:");
//            ArrayList<Nation> nations = continent.getContents();
//            System.out.println(continent.getName());
//            for (Nation nation : nations) {
//                ArrayList<Province> provinces = nation.getContents();
//                System.out.println("\t" + "Nation:");
//                System.out.println("\t" + nation.getName());
//                for (Province province : provinces) {
//                    System.out.println("\t\t" + "Province:");
//                    ArrayList<City> cities = province.getContents();
//                    System.out.println("\t\t" + province.getName());
//                    for (City city : cities){
//                        System.out.println("\t\t\t" + "City:");
//                        System.out.println("\t\t\t" + city.getName());
//                        ArrayList<Quarter> quarters = city.getContents();
//                        for (Quarter quarter : quarters){
//                            System.out.println("\t\t\t\t" + quarter.getName());
//                        }
//                    }
//                }
//            }
//        }
    }
}
