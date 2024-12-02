package lab_2.Pokemons;
import lab_2.Moves.*;
import ru.ifmo.se.pokemon.*;
public final class Chandelure extends Lampent {
    public Chandelure(String name, int level){
        super(name, level);
        setType(Type.GHOST, Type.FIRE);
        setStats(60, 55, 90, 145, 90, 80);
        setMove(new DreamEater(), new ShadowBall(), new Inferno(), new Rest());
    }
}