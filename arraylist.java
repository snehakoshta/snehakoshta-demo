import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        int simplrArray[] = new int[9];
        ArrayList<Integer> mylist = new ArrayList<Integer>(6);
    mylist.add(1);
    mylist.add(156);
    mylist.add(81);
    mylist.add(18);
    mylist.add(19);

    for(Integer x :mylist)
    System.out.println(x);
    System.out.println("size  ="+mylist.size());
    mylist.remove(1);
    mylist.remove(3);
    }
    
}
