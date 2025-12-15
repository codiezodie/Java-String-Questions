// Example input: "hello" → output: "olleh"

public class ReverseString {
  public static String reverseString(String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    return reversed;
  }

  public static void main(String[] args) {
    String original = "Hello World";
    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reverseString(original));
  }
}