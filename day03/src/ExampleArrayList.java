import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Names: " + names);
        
        System.out.println("First name: " + names.get(0));
        
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
        
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
    }
}
