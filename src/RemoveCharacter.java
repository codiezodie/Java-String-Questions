public class RemoveCharacter {
  public static String removeCharacter(String str, char ch) {
    return str.replace(String.valueOf(ch), "");
  }

  public static void main(String[] args) {
    String text = "hello world";
    char charToRemove = 'l';
    String result = removeCharacter(text, charToRemove);
    System.out.println("Original: " + text);
    System.out.println("After removing '" + charToRemove + "': " + result);
  }
}