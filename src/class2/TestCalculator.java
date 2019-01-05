package class2;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal =new Calculator();

        // regular call
        cal.add();


        // without return
        cal.addWithoutReturn(10,9);

        // with return
        int a =cal.addWithReturn(4,8);
        System.out.println(a);


    }
}
