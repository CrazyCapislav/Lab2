package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        this.type = Type.NORMAL;
        this.power = 85;
        this.accuracy = 100;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    @Override
    protected String describe() { return "использовал Body Slam";}
}