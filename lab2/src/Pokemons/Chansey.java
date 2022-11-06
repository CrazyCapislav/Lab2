package Pokemons;
import Moves.*;
public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        this.setStats(250, 5, 5, 35, 105, 50);
        this.addMove(new MudBomb());
    }
}
