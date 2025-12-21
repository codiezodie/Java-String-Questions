// Example: "programming" → "progamin"

public class RemoveDuplicates {
  public static String removeDuplicates(String str) {
    StringBuilder result = new StringBuilder();
    boolean[] seen = new boolean[256];
    
    for (char c : str.toCharArray()) {
      if (!seen[c]) {
        result.append(c);
        seen[c] = true;
      }
    }
    
    return result.toString();
  }
  
  public static void main(String[] args) {
    String input = "hello world";
    System.out.println("Original: " + input);
    System.out.println("Without duplicates: " + removeDuplicates(input));
  }
}