public class CountVowels {
  public static void main(String[] args) {
    // Vowels considered: a, e, i, o, u (case-insensitive)
    String str = "Hello World";
    int count = countVowels(str);
    System.out.println("Number of vowels: " + count);
  }
  
  public static int countVowels(String str) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    
    for (char c : str.toCharArray()) {
      if (vowels.indexOf(c) != -1) {
        count++;
      }
    }
    
    return count;
  }
}