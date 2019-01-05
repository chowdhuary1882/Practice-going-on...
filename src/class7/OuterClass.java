package class7;

//Outer Class
public class OuterClass {

    public String name;

    InnerClassA icA = new InnerClassA();


    //Outer Class Method
    public void outerClassMethodA(){
        System.out.println("This is outer class method A");
        icA.innerClassMethodA();
        InnerClassB.innerClassMethodB();

    }


    // Inner Class A
    public class InnerClassA{
        //inner classA method
        public void innerClassMethodA(){
            System.out.println("This is inner class-A method A");

        }

    }

    // Inner Class B
    public static class InnerClassB{
        //inner classB method
        public static void innerClassMethodB(){
            System.out.println("This is inner class-B method B");
        }

    }
}
