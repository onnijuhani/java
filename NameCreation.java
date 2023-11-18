import java.util.Random;

public class NameCreation {
    public static String generateNationName(Orientation style) { //style = orientation name

        // 2 Orientations imperial and democratic
        String[] imperial = {"Dominion", "Empire", "Ascedancy", "Realm", "Conclave"};
        String[] democratic = {"Federation", "Republic", "Alliance", "Union", "Syndicate", "Coalition"};
        String[] extraPrefix = {"Noble", "Grand", "Illustrious", "Majestic", "Regal", "Colossal", };
        String[] democraticNames = {
                "Stellar", "Radiant", "Ethereal", "Serene Bloom", "Blossom Harmony", "Crystal",
                "Astonishing", "Ascension", "Velvet Trail", "Whispering", "Old Harmony",
        };
        String[] imperialNames = {
                "Vanguard", "Infinite", "Pinnacle", "Iron", "Iron Legion", "Warfront", "Steel Enforcer",
                "Ironguard", "Terrific", "Stormfront", "Devastating", "Thunder", "Thunderstrike", "Warbound",
        };

        Random random = new Random();
        double randomValue = random.nextDouble();
        String addExtraPrefix = (randomValue < 0.25) ? "Orientation" : (randomValue < 0.5)  ? "Extra" : "" ;

        String prefix = "";
        String suffix = "";


        if (style.equals(Orientation.Imperial)) {
            suffix = imperial[random.nextInt(imperial.length)];
            prefix = imperialNames[random.nextInt(imperial.length)];
        } else if (style.equals(Orientation.Democratic)) {
            suffix = democratic[random.nextInt(democratic.length)];
            prefix = democraticNames[random.nextInt(democratic.length)];
        }

        if (addExtraPrefix.equals("Orientation")) {
            return style + " " + prefix + " " + suffix;
        } else if (addExtraPrefix.equals("Extra")) {
            String extra = extraPrefix[random.nextInt(extraPrefix.length)];
            return extra + " " + prefix + " " + suffix;
        }

        return prefix + " " + suffix;
    }



    public static String generateProvinceName(String style) {
        if (style.equals("imperial")) {

            String[] prefix = {
                    "Iron", "Shadowed", "Obsidian", "Thunder", "Onyx", "Warbound", "Steel", "Blackstone", "Savage", "Dreadnought"
            };
            String[] suffix = {
                    "Outpost", "Bastion", "Stronghold", "Citadel", "Garrison", "Fortress", "Citadel", "Strongarm", "Arsenal", "Bastille", "River"
            };
        }
        if (style.equals("democratic")) {
            String[] prefix = {
                    "Tranquil", "Serene", "Blossom", "Celestial", "Crystal", "Radiant", "Velvet", "Whispering", "Harmony", "Azure"
            };
            String[] suffix = {
                    "Glade", "Highlands", "Enclave", "Haven", "Expanse", "Valley", "Basin", "Shire", "Frontier", "Vale", "River", "Mountain"
            };

        }

        return "0";
    }


    public static String generateContinentNames() {

        String[] provinceNames = {
                "Terra Magna", "Celestialis", "Pangea Ultima", "Arcadia", "Astralis", "Primordia", "Eldoria", "Terra Nova",
                "Seraphica", "Mythosia", "Equinoxia", "Elysium", "Cosmara", "Verdantis", "Solara", "Chronosia", "Nebulia",
                "Ephemera", "Olympica", "Aurora Major", "Zephyria", "Novus Orbis", "Aetheria", "Heliosia", "Polaris Prime",
                "Maris Lux", "Ventura", "Silvatica", "Terravale", "Lunaria", "Serenia", "Oceana", "Caelum", "Avalon",
                "Celestria", "Atlantica", "Pacifica", "Ignitia", "Aquila Major", "Vespera", "Tempestia", "Aurora Minor"
        };
        String[] prefixName = {
                "Ancient", "Mystic", "Eternal", "Golden", "Cerulean",
                "Shrouded", "Ethereal", "Radiant", "Sacred", "Forgotten",
                "Lost", "Aurelian", "Verdant", "Crimson", "Silent",
                "Whispering", "Emerald", "Majestic", "Celestial", "Silent",
                "Sapphire", "Astral", "Enchanted", "Dusken", "Divine",
                "Mystical", "Ivory", "Silver", "Vivid", "Mythic",
                "Iridescent", "Infinite", "Twilight", "Cascading", "Pristine",
                "Abyssal", "Luminescent", "Nebula", "Harmonic", "Oblivion",
                "Royal", "Sovereign", "Epic", "Aurelia", "Lustrous"
        };

        Random random = new Random();
        String name = provinceNames[random.nextInt(provinceNames.length)];

        double randomValue = random.nextDouble();
        String value = (randomValue < 0.5) ? prefixName[random.nextInt(prefixName.length)] + " " + name : name;

        return value;

    }

}


