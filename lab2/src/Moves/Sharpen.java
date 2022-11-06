package Moves;
import ru.ifmo.se.pokemon.*;

public class Sharpen extends StatusMove {
    public Sharpen() {
        this.type = Type.NORMAL;

    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(-1).stat(Stat.ATTACK,1));
    }
    @Override
    protected String describe() { return "использовал Sharpen";}
}
