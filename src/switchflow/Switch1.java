package switchflow;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter month number=");
        int month=input.nextInt();

        switch(month){
            case 1:
                System.out.println("The month you are looking for is January");
                break;
            case 2:
                System.out.println("The month you are looking for is February");
                break;
            case 3:
                System.out.println("The month you are looking for is March");
                break;
            case 4:
                System.out.println("The month you are looking for is April");
                break;
            case 5:
                System.out.println("The month you are looking for is May");
                break;
            case 6:
                System.out.println("The month you are looking for is June");
                break;
            case 7:
                System.out.println("The month you are looking for is July");
                break;
            case 8:
                System.out.println("The month you are looking for is August");
                break;
            case 9:
                System.out.println("The month you are looking for is September");
                break;
            case 10:
                System.out.println("The month you are looking for is October");
                break;
            case 11:
                System.out.println("The month you are looking for is November");
                break;
            case 12:
                System.out.println("The month you are looking for is December");
                break;
            default:
                System.out.println("Please enter number from 1 to 12");
        }


    }


}
