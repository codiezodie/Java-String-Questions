public class RemoveAdjacentDuplicates {

    public static String removeAdjacentDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == c) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicates("abbaca")); // ca
        System.out.println(removeAdjacentDuplicates("aabbcc")); // empty
        System.out.println(removeAdjacentDuplicates("abcd"));   // abcd
    }
}
