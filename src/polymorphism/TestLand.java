package polymorphism;

public class TestLand {

    public static void main(String[] args) {
        LandCalculator cal = new LandCalculator();
        System.out.println(cal.areaOfLand(10, 5));
        System.out.println("Land Cal: " +cal.areaOfLand(10, 5, 15));

        ModernCalculator mc = new ModernCalculator();
        System.out.println("Modern Cal: " + mc.areaOfLand(10, 5, 15));
    }


}
