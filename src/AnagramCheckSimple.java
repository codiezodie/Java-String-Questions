public class AnagramCheckSimple {
  public static boolean areAnagrams(String str1, String str2) {
    // Remove spaces and convert to lowercase
    str1 = str1.replaceAll("\\s+", "").toLowerCase();
    str2 = str2.replaceAll("\\s+", "").toLowerCase();
    
    // If lengths are different, they can't be anagrams
    if (str1.length() != str2.length()) {
      return false;
    }
    
    // Create frequency arrays for each string
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];
    
    // Count character frequencies
    for (int i = 0; i < str1.length(); i++) {
      freq1[str1.charAt(i) - 'a']++;
      freq2[str2.charAt(i) - 'a']++;
    }
    
    // Compare frequencies
    for (int i = 0; i < 26; i++) {
      if (freq1[i] != freq2[i]) {
        return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    
    if (areAnagrams(str1, str2)) {
      System.out.println(str1 + " and " + str2 + " are anagrams");
    } else {
      System.out.println(str1 + " and " + str2 + " are not anagrams");
    }
  }
}