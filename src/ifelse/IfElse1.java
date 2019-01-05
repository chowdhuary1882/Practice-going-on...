package ifelse;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of the month =");
        int month=in.nextInt();

        if(month==1) {
            System.out.println("The month you are looking for is January");
        }
        else if(month==2) {
            System.out.println("The month you are looking for is February");
        }
        else if(month==3) {
            System.out.println("The month you are looking for is March");
        }
        else if(month==4) {
            System.out.println("The month you are looking for is April");
        }
        else if(month==5) {
            System.out.println("The month you are looking for is May");
        }
        else if(month==6) {
            System.out.println("The month you are looking for is June");
        }
        else if(month==7) {
            System.out.println("The month you are looking for is July");
        }
        else if(month==8) {
            System.out.println("The month you are looking for is August");
        }
        else if(month==9) {
            System.out.println("The month you are looking for is September");
        }
        else if(month==10) {
            System.out.println("The month you are looking for is October");
        }
        else if(month==11) {
            System.out.println("The month you are looking for is November");
        }
        else if(month==12) {
            System.out.println("The month you are looking for is December");
        }
        else  {
            System.out.println("The month you are looking for is should enter between 1 to 12");
        }

    }
}
