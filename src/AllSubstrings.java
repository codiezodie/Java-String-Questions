public class AllSubstrings {
  public static void printAllSubstrings(String str) {
    int n = str.length();
    
    // Outer loop for starting index
    for (int i = 0; i < n; i++) {
      // Inner loop for ending index
      for (int j = i + 1; j <= n; j++) {
        System.out.println(str.substring(i, j));
      }
    }
  }
  
  public static void main(String[] args) {
    String str = "ABC";
    printAllSubstrings(str);
  }
}