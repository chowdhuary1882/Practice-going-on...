package corejava;

public class AssignmentOperator {

    public static void main(String[] args) {

        int number1 = 3, number2 = 4;

        System.out.println("Original value of x is: " +number1);
        System.out.println("Original value of y is: " +number2);

        number1 += number2;
        System.out.println("New value of x is: "+number1);

        number1 -= number2;
        System.out.println("New value of x is: "+number1);

        number1 *= number2;
        System.out.println("New value of x is: "+number1);

        number1 += number2;
        System.out.println("New value of x is: "+number1);


    }
}
