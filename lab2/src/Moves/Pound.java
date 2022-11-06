package Moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {
    public Pound() {
        this.type = Type.NORMAL;
        this.power = 40;
        this.accuracy = 100;

    }
    @Override
    protected String describe() { return "использовал Pound";}
}
//готов