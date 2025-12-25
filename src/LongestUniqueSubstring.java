public class LongestUniqueSubstring {
  public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    
    java.util.Map<Character, Integer> charMap = new java.util.HashMap<>();
    int maxLength = 0;
    int left = 0;
    
    for (int right = 0; right < s.length(); right++) {
      char currentChar = s.charAt(right);
      
      if (charMap.containsKey(currentChar)) {
        left = Math.max(left, charMap.get(currentChar) + 1);
      }
      
      charMap.put(currentChar, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }
    
    return maxLength;
  }
  
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));      // Output: 3 ("abc")
    System.out.println(lengthOfLongestSubstring("bbbbb"));         // Output: 1 ("b")
    System.out.println(lengthOfLongestSubstring("pwwkew"));        // Output: 3 ("wke")
    System.out.println(lengthOfLongestSubstring(""));              // Output: 0
    System.out.println(lengthOfLongestSubstring("abcdefghij"));    // Output: 10
  }
}