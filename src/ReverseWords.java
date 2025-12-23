public class ReverseWords {
  public static void main(String[] args) {
    String sentence = "Hello World Java Programming";
    System.out.println("Original: " + sentence);
    System.out.println("Reversed: " + reverseWords(sentence));
  }

  public static String reverseWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder reversed = new StringBuilder();
    
    for (int i = words.length - 1; i >= 0; i--) {
      reversed.append(words[i]);
      if (i > 0) {
        reversed.append(" ");
      }
    }
    
    return reversed.toString();
  }
}