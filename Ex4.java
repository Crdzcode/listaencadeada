package Ex6;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Integer x = 0;
        Integer y = 0;

        l1.add(3);
        l1.add(38);
        l1.add(21);
        l1.add(59);
        l1.add(49);
        l1.add(13);
        l1.add(24);
        l1.add(36);
        
        Iterator i = l1.iterator();
        while (i.hasNext()){
            y = (Integer)i.next();
            if (x<y){
                x = y;
            }
        }
        System.out.println(x);
    }
}
