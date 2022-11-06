package Moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        this.type = Type.NORMAL;
        this.power = 70;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "использовал Facade";
    }
}