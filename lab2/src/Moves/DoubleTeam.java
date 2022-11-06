package Moves;

import Pokemons.Dhelmise;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam() {
        this.type = Type.NORMAL;

    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(-1).stat(Stat.EVASION,1));
    }
    @Override
    protected String describe() { return "использовал Double Team";}
}
//готов