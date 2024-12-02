package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class Agility extends StatusMove{
    public Agility(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 2);
    }
    @Override
    protected String describe(){
        return "использована атака Agility";
    }
}
