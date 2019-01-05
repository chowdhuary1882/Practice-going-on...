package class2;

public class Calculator {

    public int addWithReturn(int a, int b){
        int c=a+b;
        return c;
    }


    public void addWithoutReturn(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

    public void add(){
        int a = 5;
        int b = 10;
        int c=a+b;
        System.out.println(c);
    }
}
