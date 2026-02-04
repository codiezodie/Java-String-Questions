import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "hello", "enlist", "world");
        Map<String, List<String>> anagrams = groupAnagrams(words);

        anagrams.forEach((key, value) -> System.out.println(value));
    }

    private static Map<String, List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return map;
    }
}
