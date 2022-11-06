package Moves;

import Pokemons.Dhelmise;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        this.type = Type.DRAGON;
        this.power = 80;
        this.accuracy = 100;

    }
    @Override
    protected String describe() { return "использовал Dragon Claw";}
}
//готов