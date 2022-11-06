package Pokemons;

import Moves.*;

public class Avalugg extends Bergmite {
    public Avalugg(String name, int level) {
        super(name, level);
        this.setStats(95, 117, 184, 44, 46, 28);
        this.addMove(new BodySlam());
    }
}
