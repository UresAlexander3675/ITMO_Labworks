package lab_2.Pokemons;
import lab_2.Moves.*;
import ru.ifmo.se.pokemon.*;

public class Patrat extends Pokemon {
    public Patrat(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(45, 55, 39, 35, 39, 42);
        setMove(new Crunch(), new NastyPlot(), new SwordsDance());
    }
}