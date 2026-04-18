import java.util.LinkedList;
import java.util.ListIterator;
public class List {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Dick");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        System.out.println(staff);
        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Juliet");
        iterator.add("Nina");
        iterator.next();
        iterator.remove();
        for (String name : staff) {
            System.out.println(name);
        }
    }
}
