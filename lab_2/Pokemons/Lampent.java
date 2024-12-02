package lab_2.Pokemons;
import lab_2.Moves.*;
import ru.ifmo.se.pokemon.*;
public class Lampent extends Litwick {
    public Lampent(String name, int level){
        super(name, level);
        setType(Type.GHOST, Type.FIRE);
        setStats(60, 40, 60, 95, 60, 55);
        setMove(new DreamEater(), new ShadowBall(), new Inferno());
    }
}