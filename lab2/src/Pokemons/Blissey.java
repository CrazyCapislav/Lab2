package Pokemons;
import Moves.*;
public class Blissey extends Chansey {
    public Blissey(String name, int level) {
        super(name, level);
        this.setStats(255, 10, 10, 75, 135, 55);
        this.addMove(new Pound());
    }
}
