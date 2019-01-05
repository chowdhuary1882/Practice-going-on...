package DS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class UseLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("PA");
        list.add("NJ");
        list.add("FL");

        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        list.remove("PA");
        System.out.println("after removing node");
        it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}
