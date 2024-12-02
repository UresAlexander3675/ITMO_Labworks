package lab_2.Moves;
import ru.ifmo.se.pokemon.*;
public final class DreamEater extends SpecialMove{
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, -((int)(damage)));
    }
    @Override
    protected String describe(){
        return "использована атака Dream Eater";
    }
}
