public class Character {
    Wallet wallet;



}

class Authority extends Character {
    String name;
    Authority authorityOver;

}

class Support extends Character {

}


class King extends Authority {

}

class Noble extends Support {

}

class Vanguard extends Support {

}

class Governor extends Authority {

}

class Mercenary extends Support {

}

class Mayor extends Authority {

}

class Captain extends Authority {

}

class Peasant extends Character {


}

class Farmer extends Peasant {

}

class Miner extends Peasant {

}

class Merchant extends Peasant {

}

class Slave extends Peasant {

}

