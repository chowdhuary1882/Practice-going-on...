package practices;

// int a  mean declare one integer variable
// int a=10 mean variable is initialized
// double pi = 3.141 mean declare and assign a value of pi
// variable is declared and initialized in method, constructor or block
// visible in method , constructor or block and destroy when
// no default value, so always has to initialize
// Access modifier is not used
// Implemented in stack memory

public class LocalVariable {

    public void myAge(){
        int age =0; // age is a local variable for myAge method
        age=age+7;
        System.out.println("Age is:" +age);
    }

    public static void main(String[] args) {


        LocalVariable lc = new LocalVariable();
        lc.myAge();
    }

}
