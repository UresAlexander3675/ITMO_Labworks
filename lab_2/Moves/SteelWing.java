package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class SteelWing extends PhysicalMove{
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() < 0.1){
            p.setMod(Stat.DEFENSE, 1);
        }
    }
    @Override
    protected String describe(){
        return "использует атаку Steel Wing";
    }
}
