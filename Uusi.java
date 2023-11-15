import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Uusi {

    private static final String TIEDOSTO_POLKU = "numerot.txt";

    public static void main(String[] args){

        String ohjelmanKansio = System.getProperty("user.dir");
        System.out.println("Ohjelman käynnistyskansio: " + ohjelmanKansio);

        ArrayList<Integer> numerot = lueNumerotTiedostosta(); // Lue numerot tiedostosta
        tarkistaJaLuoTiedosto();
        while (true) {


            Scanner lukija = new Scanner(System.in);
            System.out.print("Anna Luku: ");
            String syote = lukija.nextLine();

            if (syote.equalsIgnoreCase("lopeta")){
                break;
            } else {
                try {
                    int luku = Integer.parseInt(syote);
                    System.out.println(luku);
                    numerot.add(luku);

                } catch (NumberFormatException e) {
                    System.out.println("Virheellinen syöte. Anna kokonaisluku tai kirjoita 'lopeta'.");
                }
            }

        }
        for (int i=1; i<numerot.size(); i++){
            numerot.set(i, numerot.get(i)*5);
        }
        System.out.println(numerot);
        tallennaNumerotTiedostoon(numerot);

        int summa = 0;

        for (int luku : numerot){
            summa += luku;
        }
        System.out.println(summa);

    }

    private static void tarkistaJaLuoTiedosto() {
        Path tiedostoPolku = Path.of(TIEDOSTO_POLKU);

        if (!Files.exists(tiedostoPolku)) {
            try {
                Files.createFile(tiedostoPolku);
                System.out.println("Tiedosto luotu: " + tiedostoPolku);
            } catch (IOException e) {
                System.out.println("Virhe tiedoston luomisessa: " + e.getMessage());
            }
        }
    }

    private static void tallennaNumerotTiedostoon(ArrayList<Integer> numerot) {
        Path tiedostoPolku = Path.of(TIEDOSTO_POLKU);

        try (BufferedWriter writer = Files.newBufferedWriter(tiedostoPolku)) {
            for (int luku : numerot) {
                writer.write(Integer.toString(luku));
                writer.newLine();
            }
            System.out.println("Numerot tallennettu tiedostoon: " + tiedostoPolku);
        } catch (IOException e) {
            System.out.println("Virhe tallennettaessa numeroita tiedostoon: " + e.getMessage());
        }
    }

    private static ArrayList<Integer> lueNumerotTiedostosta() {
        ArrayList<Integer> numerot = new ArrayList<>();
        Path tiedostoPolku = Path.of(TIEDOSTO_POLKU);

        if (Files.exists(tiedostoPolku)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(TIEDOSTO_POLKU))) {
                String rivi;
                while ((rivi = reader.readLine()) != null) {
                    numerot.add(Integer.parseInt(rivi));
                }
                System.out.println("Numerot luettu tiedostosta: " + numerot);
            } catch (IOException | NumberFormatException e) {
                System.out.println("Virhe luettaessa numeroita tiedostosta: " + e.getMessage());
            }
        }

        return numerot;
    }

}


