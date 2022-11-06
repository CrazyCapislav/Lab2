package Moves;
import ru.ifmo.se.pokemon.*;
import java.util.ResourceBundle;
public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        this.type = Type.GHOST;
        this.power = 70;
        this.accuracy = 100;

    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED)* 3.0 / 512.0 > Math.random()) {
            System.out.println(ResourceBundle.getBundle("ru.ifmo.se.pokemon.Messages").getString("critical"));
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe () {
        return "использовал Shadow Claw";
        }
    }

