import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class test {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Dhelmise("Димас", 1);
        Pokemon p2 = new Bergmite("Саня", 1);
        Pokemon p3 = new Avalugg("Миша", 30);
        Pokemon p4 = new Happiny("Ваня", 1);
        Pokemon p5 = new Chansey("Шура", 1);
        Pokemon p6 = new Blissey("Алек", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p5);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }

}
