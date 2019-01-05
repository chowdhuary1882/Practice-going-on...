package corejava;

import java.util.Scanner;

public class UserIn {
    public static void main(String[] args) {
        int number1, number2, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        number1 = sc.nextInt();

        System.out.print("Enter the Second number : ");
        number2 = sc.nextInt();

        System.out.println("You entered numbers are : "+number1+" and "+number2);

        System.out.println("====================================");

        result = number1+number2;
        System.out.println("Addition of "+number1+" and"+number2+" is :::::::"+result);

        result = number1-number2;
        System.out.println("Subtraction of "+number1+"and"+number2+" is ::::"+result);

        result = number1*number2;
        System.out.println("Multiplication of "+number1+"and"+number2+" is :"+result);

        result = number1/number2;
        System.out.println("Division of "+number1+"and"+number2+" is :::::::"+result);

        result = number1%number2;
        System.out.println("Modulation of "+number1+"and"+number2+" is :::::"+result);



    }
}
