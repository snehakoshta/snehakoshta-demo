import java.util.LinkedList;
public class linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.add(34);
        list.add(90);
        list.add(56);
        list.addFirst(67);
        list.addLast(78);

        for(Integer x : list);
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(3);
    }
    
}
