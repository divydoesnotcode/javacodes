import java.util.Random;
public class Random_Numbers {
    public static void main(String[] args){
        Random random = new Random();

        int n1;
        double n2;
        boolean isHeads;

        n1 = random.nextInt(1,7);
        n2 = random.nextDouble(0,1);
        isHeads = random.nextBoolean();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(isHeads);
    }
}
