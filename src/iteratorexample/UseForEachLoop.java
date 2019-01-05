package iteratorexample;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {

    public static void main(String[] args) {
        List<String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("PA");
        stList.add("NJ");

        for(String state:stList){
            System.out.println(state);
        }

    }

}
