
import java.util.HashSet;
public class listiterator {
    public static void main(String[] args) {
        
        HashSet<String> name = new HashSet<String>();
        name.add("ram");
        name.add("panam");
        name.add("kiran");
        name.add("sneha");
        name.add("malti");
        for(String x: name);
        System.out.println(name);
        System.out.println(name.size());
       name.remove("ram");
       name.remove("sneha");


    }
    
}
