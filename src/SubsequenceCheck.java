public class SubsequenceCheck {
  
  public static boolean isSubsequence(String s, String t) {
    int sIndex = 0;
    int tIndex = 0;
    
    while (sIndex < s.length() && tIndex < t.length()) {
      if (s.charAt(sIndex) == t.charAt(tIndex)) {
        sIndex++;
      }
      tIndex++;
    }
    
    return sIndex == s.length();
  }
  
  public static void main(String[] args) {
    String s = "ace";
    String t = "abcde";
    
    System.out.println(isSubsequence(s, t)); // true
    System.out.println(isSubsequence("aec", t)); // false
    System.out.println(isSubsequence("", t)); // true
  }
}