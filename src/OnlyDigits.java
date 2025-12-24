public class OnlyDigits {
  public static void main(String[] args) {
    String test1 = "12345";
    String test2 = "123a45";
    String test3 = "00999";
    
    System.out.println(test1 + " contains only digits: " + isOnlyDigits(test1));
    System.out.println(test2 + " contains only digits: " + isOnlyDigits(test2));
    System.out.println(test3 + " contains only digits: " + isOnlyDigits(test3));
  }
  
  public static boolean isOnlyDigits(String str) {
    if (str == null || str.isEmpty()) {
      return false;
    }
    return str.matches("\\d+");
  }
}