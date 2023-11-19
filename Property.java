public class Property {

    int food;
    int alloy;
    int gold;
    int strength;

    public Property(int food, int alloy, int gold, int strength) {
        this.food = food;
        this.alloy = alloy;
        this.gold = gold;
        this.strength = strength;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getAlloy() {
        return alloy;
    }

    public void setAlloy(int alloy) {
        this.alloy = alloy;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}


class Fortress extends Property {
    public Fortress() {
        super(40, 30, 20, 100);
    }
}

class Citadel extends Property {
    public Citadel() {
        super(30, 30, 10, 90);
    }
}

class Castle extends Property {
    public Castle() {
        super(20, 25, 5, 70);
    }
}

class Manor extends Property {
    public Manor() {
        super(15, 10, 5, 60);
    }
}

class Mansion extends Property {
    public Mansion() {
        super(10, 0, 4, 40);
    }
}

class Villa extends Property {
    public Villa() {
        super(5, 0, 3, 30);
    }
}

class Cottage extends Property {
    public Cottage() {
        super(3, 0, 2, 20);
    }
}

class Shack extends Property {
    public Shack() {
        super(2, 0, 1, 0);
    }
}





