public class ValidPalindrome {
  public static boolean isPalindrome(String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }
    
    int left = 0;
    int right = s.length() - 1;
    
    while (left < right) {
      // Skip non-alphanumeric characters from left
      while (left < right && !Character.isAlphanumeric(s.charAt(left))) {
        left++;
      }
      
      // Skip non-alphanumeric characters from right
      while (left < right && !Character.isAlphanumeric(s.charAt(right))) {
        right--;
      }
      
      // Compare characters (case-insensitive)
      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      }
      
      left++;
      right--;
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
    System.out.println(isPalindrome("race a car")); // false
    System.out.println(isPalindrome(" ")); // true
  }
}