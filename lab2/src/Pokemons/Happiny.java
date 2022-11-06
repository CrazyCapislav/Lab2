package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny (String name, int level) {
        super(name, level);
        this.setStats(100,5,5,15,65,30);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall(), new Flamethrower());
    }
}
