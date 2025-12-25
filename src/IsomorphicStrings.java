public class IsomorphicStrings {
  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    
    java.util.Map<Character, Character> sMap = new java.util.HashMap<>();
    java.util.Map<Character, Character> tMap = new java.util.HashMap<>();
    
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      
      if (sMap.containsKey(sChar)) {
        if (sMap.get(sChar) != tChar) {
          return false;
        }
      } else {
        sMap.put(sChar, tChar);
      }
      
      if (tMap.containsKey(tChar)) {
        if (tMap.get(tChar) != sChar) {
          return false;
        }
      } else {
        tMap.put(tChar, sChar);
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    System.out.println(isIsomorphic("egg", "add"));      // true
    System.out.println(isIsomorphic("foo", "bar"));      // false
    System.out.println(isIsomorphic("paper", "title"));  // true
  }
}