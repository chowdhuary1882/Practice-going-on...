package outerclass;

public class OuterClass {
    public String name;
    InnerClassA innerClassA = new InnerClassA();
    //OuterClass method
    public void outerClassMethodA(){
        System.out.println("This is outer class method A");
        innerClassA.innerAClassMethodA();
        InnerClassB.innerBClassMethodA();
    }


    public class InnerClassA{
        //InnerClassA method
        public void innerAClassMethodA(){
            System.out.println("This is Inner class-A method A");
        }
    }//end of InnerA class

    public static class InnerClassB{

        //InnerClassB method
        private static void innerBClassMethodA(){
            System.out.println("This is Inner class-B method B");
        }
    }//end of InnerB class
}//end of Outer CLass
