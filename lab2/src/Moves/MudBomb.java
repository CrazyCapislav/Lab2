package Moves;
import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        this.type = Type.GROUND;
        this.power = 65;
        this.accuracy = 85;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).chance(0.3).stat(Stat.ACCURACY, -1));
    }
    @Override
    protected String describe() { return "использовал Mud Bomb";}
}
