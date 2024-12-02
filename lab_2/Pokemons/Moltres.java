package lab_2.Pokemons;
import lab_2.Moves.*;
import ru.ifmo.se.pokemon.*;
public final class Moltres extends Pokemon{
    public Moltres(String name, int level){
        super(name, level);
        setType(Type.FIRE, Type.FLYING);
        setStats(90, 100, 90, 125, 85, 90);
        setMove(new SteelWing(), new DoubleTeam(), new Agility(), new Hurricane());
    }
}