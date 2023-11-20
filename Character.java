public class Character {
    Wallet wallet;



    public Character() {
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}

class AuthorityCharacter extends Character {

    Authority authorityOver;
}

class Support extends Character {


}



class King extends AuthorityCharacter {


    public King() {
        super(); // Call the superclass constructor
    }
}


class Noble extends Support {


    public Noble() {
    }
}

class Vanguard extends Support {


    public Vanguard() {
    }
}

class Governor extends AuthorityCharacter {


    public Governor() {
    }
}

class Mercenary extends Support {


    public Mercenary() {
    }
}

class Mayor extends AuthorityCharacter {


    public Mayor() {
    }
}

class Captain extends AuthorityCharacter {


    public Captain() {
    }
}

class Peasant extends Character {


    public Peasant() {
    }
}

class Farmer extends Peasant {


    public Farmer() {
    }
}

class Miner extends Peasant {


    public Miner() {
    }
}

class Merchant extends Peasant {


    public Merchant() {
    }
}

class Slave extends Peasant {

    public Slave() {
    }
}

