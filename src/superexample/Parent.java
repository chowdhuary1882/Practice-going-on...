package superexample;

public abstract class Parent {

    String familyName = "Bush";

    public Parent() {
        System.out.println("This is parents class constructor");
    }
    public Parent(String familyName) {
        this.familyName = familyName;
        System.out.println("This is parents class constructor "+ familyName);
    }

    public void height() {
        System.out.println("Average height");
    }
    public void color() {
        System.out.println("brown");
    }

}
