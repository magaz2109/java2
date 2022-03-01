package les4;
import java.util.*;
public class task {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "dog", "mouse", "dog", "mouse", "pig", "elephant", "lynx"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Grigorov", "11111");
        pb.add("Ismailov", "22222");
        pb.add("Ismailov", "33333");

        System.out.println(pb.get("Ismailov"));
    }
}
