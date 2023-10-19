import java.util.ArrayList;
import java.util.Random;

public class Tree {
    double avgNutWeight=12.5;
    double nutWeightDeviation = 1.5;
    int minArrSize=2;
    int maxArrSize=10;


    public ArrayList<Nut> growNuts(int amount)
    {
        ArrayList<Nut> list = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            list.add(growOneNut());
        }
        return list;
    }

    private Nut growOneNut() {
        Random random = new Random();
        double w = random.nextGaussian()*nutWeightDeviation + avgNutWeight;
        return new Nut(w);
    }

    public ArrayList<Nut> growRandomNuts()
    {
        Random random = new Random();
        int k = random.nextInt(minArrSize, maxArrSize+1);
        return growNuts(k);
    }
}
