package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dhelmise extends Pokemon {
    public Dhelmise (String name, int level) {
        super(name, level);
        this.setStats(70,131,100,86,90,40);
        this.setType(Type.GHOST,Type.GRASS);
        this.setMove(new DragonClaw(), new ShadowClaw(), new DoubleTeam(), new ThunderWave());
    }


    }

