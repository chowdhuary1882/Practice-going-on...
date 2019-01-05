package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ArrayList5 {
    public static void main(String[] args) {
        int limit =20;
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        for(int i=0; i<limit; i++){

            list.add(random.nextInt(10));

        }

        for(int j =0; j<limit; j++) {
            System.out.println(list.get(j));
        }
    }
}
