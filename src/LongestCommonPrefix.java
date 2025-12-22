// Example: ["flower","flow","flight"] → "fl"
public class LongestCommonPrefix {
  
  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    
    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      
      for (int j = 1; j < strs.length; j++) {
        if (i >= strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    
    return strs[0];
  }
  
  public static void main(String[] args) {
    String[] test1 = {"flower", "flow", "flight"};
    System.out.println("LCP: " + longestCommonPrefix(test1)); // Output: "fl"
    
    String[] test2 = {"dog", "racecar", "car"};
    System.out.println("LCP: " + longestCommonPrefix(test2)); // Output: ""
    
    String[] test3 = {"abc", "abc", "abc"};
    System.out.println("LCP: " + longestCommonPrefix(test3)); // Output: "abc"
  }
}