import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();

        //Nut[] mas = t.growNuts(7);
        ArrayList<Nut> list1 = t.growRandomNuts();
        System.out.println(list1);
        Squirrel tirli = new Squirrel("Тирли");
        double w1 = tirli.nutCollecting(list1);
        System.out.println("Белочка "+tirli.name+" насобирала орехов весом "+w1);

        ArrayList<Nut> list2 = t.growRandomNuts();
        System.out.println(list2);
        Squirrel dirli = new Squirrel("Дирли");
        double w2 = dirli.nutCollecting(list2);
        System.out.println("Белочка "+dirli.name+" насобирала орехов весом "+w2);

    }
}