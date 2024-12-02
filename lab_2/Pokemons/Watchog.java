package lab_2.Pokemons;
import lab_2.Moves.*;
import ru.ifmo.se.pokemon.*;

public final class Watchog extends Patrat {
    public Watchog(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 85, 69, 60, 69, 77);
        setMove(new Crunch(), new NastyPlot(), new SwordsDance());
    }
}