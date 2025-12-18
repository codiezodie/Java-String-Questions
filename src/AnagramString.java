import java.util.Arrays;

public class AnagramString {
  
  public static boolean areAnagrams(String str1, String str2) {
    // Example: "listen" and "silent" are anagrams

    // Remove spaces and convert to lowercase
    String s1 = str1.replaceAll("\\s", "").toLowerCase();
    String s2 = str2.replaceAll("\\s", "").toLowerCase();
    
    // Check if lengths are equal
    if (s1.length() != s2.length()) {
      return false;
    }
    
    // Sort characters and compare
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    return Arrays.equals(arr1, arr2);
  }
  
  public static void main(String[] args) {
    String string1 = "listen";
    String string2 = "silent";
    
    if (areAnagrams(string1, string2)) {
      System.out.println(string1 + " and " + string2 + " are anagrams.");
    } else {
      System.out.println(string1 + " and " + string2 + " are not anagrams.");
    }
  }
}