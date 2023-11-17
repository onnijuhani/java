import java.util.Random;

public class NameCreation {
    public static String generateNationName(String style) {

        // 2 Styles imperial and democratic
        String[] imperial = {"Dominion", "Empire", "Ascedancy", "Realm", "Conclave"};
        String[] democratic = {"Federation", "Republic", "Alliance", "Union", "Syndicate", "Coalition"};

        String[] nationNames = {
                "Stellar", "Noble", "Radiant", "Ethereal", "Vanguard", "Infinite", "Pinnacle", "Grand",
                "Ironguard", "Terrific", "Astonishing", "Ascension", "Stormfront", "Devastating",
        };

        Random random = new Random();

        String suffix;

        if (style.equals("Imperial")) {
            suffix = imperial[random.nextInt(imperial.length)];
        } else {
            suffix = democratic[random.nextInt(imperial.length)];
        }
        String prefix = nationNames[random.nextInt(nationNames.length)];

        return prefix + " " + suffix;
    }

    public static String generateProvinceName(String area) {
        Random random = new Random();
        String[] Prefixes = {"Verdant", "Serene", "Tranquil", "Noble", "Radiant", "Majestic", "Evergreen", "Golden", "Crimson", "Ethereal"};
        String[] Suffixes = {"Shire", "Valley", "Highlands", "Vale", "Enclave", "Expanse", "Frontier", "Haven", "Basin", "Glade", "Mountains", "Caves"};
        String prefix = Prefixes[random.nextInt(Prefixes.length)];
        String suffix = Suffixes[random.nextInt(Suffixes.length)];
        return prefix + " " + suffix;
    }
}


