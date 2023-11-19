import java.util.Random;
import java.util.Arrays;


public class RandomTest {


    public static void main(String[] args){

        int maxPop = 50000;
        int minPop = 1000;

        Random arpoja = new Random();
        int population = arpoja.nextInt(maxPop - minPop) +minPop;
        Double ratio = arpoja.nextDouble();

        System.out.println(population);
        System.out.println(ratio);
    }

}