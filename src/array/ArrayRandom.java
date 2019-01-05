package array;

import java.util.Random;

public class ArrayRandom {

    public static void main(String[] args) {
        int [] list = new int[4];
        Random random = new Random();
        for(int j=0; j<list.length; j++) {
            list[j] = random.nextInt(10);
        }
        for(int i=0; i<list.length; i++) {
            System.out.print(list[i]);
        }
    }

}
