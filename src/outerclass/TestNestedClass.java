package outerclass;

public class TestNestedClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerClassMethodA();
        OuterClass.InnerClassB outerB = new OuterClass.InnerClassB();

    }


}
