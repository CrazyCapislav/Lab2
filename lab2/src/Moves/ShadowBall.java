package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        this.type = Type.GHOST;
        this.power = 80;
        this.accuracy = 100;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1));
    }
    @Override
    protected String describe() { return "использовал Shadow Ball";}
}
