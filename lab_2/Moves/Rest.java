package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(2);
        p.restore();
        e.sleep(p);
    }
    @Override
    protected String describe(){
        return "использует атаку Rest";
    }
}
