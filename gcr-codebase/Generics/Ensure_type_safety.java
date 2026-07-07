import java.util.*;

public class TypeSafetyExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Harshit");
        names.add("Rahul");
        // names.add(100); // Compile-time error

        for (String name : names) {
            System.out.println(name);
        }
    }
}