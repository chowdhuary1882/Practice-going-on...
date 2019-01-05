package class2;

public class Constructor {

    int houseNumber ;
    String houseName = "White House";

    public Constructor(String houseName){
        this.houseName = houseName;
        System.out.println(houseName);
    }

    public Constructor(int houseNumber){
        this.houseNumber = houseNumber;
        System.out.println(houseNumber);

    }

    public String getHouseName(){
        return houseName;
    }

    public void numberOfBedRoom(){
        System.out.println("There is 3 Bed Rooms");
    }

}
