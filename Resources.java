import java.util.ArrayList;
import java.util.Arrays;

public class Resources {
}

class Wallet {
    int Food;
    int Alloy;
    int Gold;

    public Wallet(int food, int alloy, int gold) {
        Food = food;
        Alloy = alloy;
        Gold = gold;
    }

    public ArrayList<Integer> getWalletValues() {
        ArrayList<Integer> wallet = new ArrayList<>();
        return new ArrayList<>(Arrays.asList(Food, Alloy, Gold));

    }

    public int getFood() {
        return Food;
    }

    public void setFood(int food) {
        Food = food;
    }

    public int getAlloy() {
        return Alloy;
    }

    public void setAlloy(int alloy) {
        Alloy = alloy;
    }

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        Gold = gold;
    }
}

class Food extends Resources {

}

class Alloy extends Resources {

}

class Gold extends Resources {

}

enum Resource {
    Food,
    Alloy,
    Gold
}