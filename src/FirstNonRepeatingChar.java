public class FirstNonRepeatingChar {
  
  public static char findFirstNonRepeatingChar(String str) {
    if (str == null || str.isEmpty()) {
      return '\0';
    }
    
    // Count frequency of each character
    java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();
    for (char c : str.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    
    // Find first character with count 1
    for (char c : str.toCharArray()) {
      if (charCount.get(c) == 1) {
        return c;
      }
    }
    
    return '\0'; // No non-repeating character found
  }
  
  public static void main(String[] args) {
    String str1 = "hello";
    System.out.println("First non-repeating character: " + findFirstNonRepeatingChar(str1));
    
    String str2 = "aabbcc";
    System.out.println("First non-repeating character: " + findFirstNonRepeatingChar(str2));
  }
}