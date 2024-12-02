package lab_2;
import lab_2.Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class lab_2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Chandelure p1 = new Chandelure("Chandelure", 10);
        Lampent p2 = new Lampent("Lampent", 10);
        Moltres p3 = new Moltres("Moltres", 10);
        Litwick p4 = new Litwick("Litwick", 10);
        Patrat p5 = new Patrat("Patrat", 10);
        Watchog p6 = new Watchog("Watchog", 10);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
