package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class Hurricane extends SpecialMove{
    public Hurricane(){
        super(Type.FLYING, 110, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.confuse(p);
        }
    }
    @Override
    protected String describe(){
        return " использует Hurricane";
    }
}
