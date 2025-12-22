public class StringRotation {
  
  /**
   * Checks if one string is a rotation of another.
   * Example: "waterbottle" is a rotation of "erbottlewat"
   */
  public static boolean isRotation(String s1, String s2) {
    // Check if lengths are equal
    if (s1.length() != s2.length()) {
      return false;
    }
    
    // Concatenate s1 with itself
    String temp = s1 + s1;
    
    // Check if s2 is a substring of temp
    return temp.contains(s2);
  }
  
  public static void main(String[] args) {
    String s1 = "waterbottle";
    String s2 = "erbottlewat";
    
    if (isRotation(s1, s2)) {
      System.out.println(s2 + " is a rotation of " + s1);
    } else {
      System.out.println(s2 + " is NOT a rotation of " + s1);
    }
    
    // Test case 2
    String s3 = "hello";
    String s4 = "llohe";
    System.out.println(isRotation(s3, s4)); // true
    
    // Test case 3
    String s5 = "abc";
    String s6 = "acb";
    System.out.println(isRotation(s5, s6)); // false
  }
}