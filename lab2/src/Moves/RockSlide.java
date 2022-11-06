package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        this.type = Type.ROCK;
        this.power = 75;
        this.accuracy = 90;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.3).success())
            Effect.flinch(p);
    }
    @Override
    protected String describe() { return "использовал Rock Slide";}
}