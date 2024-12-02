package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class SwordsDance extends StatusMove{
    public SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected String describe(){
        return "использует атаку Swords Dance";
    }
}
