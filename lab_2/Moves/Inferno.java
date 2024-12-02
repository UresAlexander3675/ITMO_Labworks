package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class Inferno extends SpecialMove{
    public Inferno(){
        super(Type.FIRE, 100, 50);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.burn(p);
    }
    @Override
    protected String describe(){
        return "использует атаку Inferno";
    }
}
