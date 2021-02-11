package Ex5;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        Integer sum = 0;

        l1.add(0);
        l1.add(10);
        l1.add(14);
        l1.add(23);
        l1.add(6);

        Iterator i = l1.iterator();
        while (i.hasNext()){
            sum += (Integer)i.next();
        }
        System.out.println(sum);

    }
}
