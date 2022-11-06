package Moves;
import Pokemons.Blissey;
import Pokemons.Dhelmise;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends SpecialMove {
    public ThunderWave() {
        this.type = Type.ELECTRIC;
        this.accuracy = 90;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    @Override
    protected String describe() { return "использовал Thunder Wave";}
}
//готов