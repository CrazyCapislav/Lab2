package Moves;
import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        this.type = Type.FIRE;
        this.power = 90;
        this.accuracy = 100;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {p.addEffect(new Effect().chance(0.1).condition(Status.BURN));

    }
    @Override
    protected String describe() { return "использовал Flamethrower";}
}
