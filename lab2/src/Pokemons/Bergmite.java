package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bergmite extends Pokemon {
    public Bergmite (String name, int level) {
        super(name, level);
        this.setStats(55,69,85,32,35,28);
        this.setType(Type.ICE);
        this.setMove(new Facade(), new RockSlide(), new Sharpen());
    }
}
