public class OnlyAlphabets {
  public static void main(String[] args) {
    String str1 = "HelloWorld";
    String str2 = "Hello123";
    String str3 = "Java@Program";
    
    System.out.println(str1 + " contains only alphabets: " + isOnlyAlphabets(str1));
    System.out.println(str2 + " contains only alphabets: " + isOnlyAlphabets(str2));
    System.out.println(str3 + " contains only alphabets: " + isOnlyAlphabets(str3));
  }
  
  public static boolean isOnlyAlphabets(String str) {
    if (str == null || str.isEmpty()) {
      return false;
    }
    return str.matches("[a-zA-Z]+");
  }
}