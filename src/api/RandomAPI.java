package api;

import java.util.Random;

public class RandomAPI {


    public static void main(String[] args) {

        Random randomNumber = new Random();
        for(int i=1;i<7;i++) {
            System.out.println(randomNumber.nextInt(2));
            //System.out.println(randomNumber.nextInt(5) + 1);
            //System.out.println(randomNumber.nextInt(5) + 1);
            //System.out.println(randomNumber.nextInt(5) + 1);
            //System.out.println(randomNumber.nextInt(5) + 1);
            //System.out.println(randomNumber.nextInt(5) + 1);
        }

    }



}
