package class2;

public class TestHome {
    public static void main(String[] args) {
        /*
        int houseNumber = 3;
    String houseName = "White House";

    public String getHouseName(){
        return houseName;
    }

    public void numberOfBedRoom(){
        System.out.println("There is 3 Bed Rooms");
    }
         */
        Home myHome = new Home();
        //myHome.numberOfBedRoom();

        String h = myHome.houseName;
        System.out.println(h);

       // System.out.println(myHome.houseName);
        //System.out.println(myHome.houseNumber);



    }
}
