package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class Crunch extends PhysicalMove{
    public Crunch() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.2){
            p.setMod(Stat.DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использована атака Crunch";
    }
}
