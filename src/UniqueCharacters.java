public class UniqueCharacters {
  public static boolean hasUniqueCharacters(String str) {
    if (str == null) {
      return false;
    }
    
    return str.length() == str.chars().distinct().count();
  }
  
  public static void main(String[] args) {
    System.out.println(hasUniqueCharacters("hello"));      // false
    System.out.println(hasUniqueCharacters("world"));      // false
    System.out.println(hasUniqueCharacters("abcdef"));     // true
    System.out.println(hasUniqueCharacters("a"));          // true
    System.out.println(hasUniqueCharacters(""));           // true
  }
}