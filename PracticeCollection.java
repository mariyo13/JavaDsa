
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeCollection {

    public static void arrayList() {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 5) {
                System.out.println("yes");
            }
            System.out.println(it.next());

        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        arrayList();
    }
}
