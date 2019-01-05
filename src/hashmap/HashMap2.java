package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class HashMap2 {

    public static void main(String[] args) {
        //Map<String, String> state = new LinkedHashMap<String, String>(); //maintains order
        Map<String, String> state = new HashMap<String, String>(); //doesnot maintain order
        state.put("USA", "NY");
        state.put("Canada", "Toronto");
        state.put("UK", "London");
        for(Map.Entry entry:state.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
