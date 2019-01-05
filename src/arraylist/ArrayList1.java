package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String args[]){

        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Team");
        alist.add("main");
        alist.add("Tom");
        alist.add("Luy");
        alist.add("Pit");
        alist.add("Angel");
        alist.add("Tom");

        //displaying elements
        System.out.println(alist);

        //Adding "Steve" at the fourth position
        alist.add(3, "Google");

        //displaying elements
        System.out.println(alist);
    }


}
