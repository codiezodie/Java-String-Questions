import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
  public static void main(String[] args) {
    String str = "hello world";
    countCharacterFrequency(str);
  }

  public static void countCharacterFrequency(String str) {
    Map<Character, Integer> frequencyMap = new HashMap<>();
    
    // Remove spaces and convert to lowercase
    str = str.replaceAll(" ", "").toLowerCase();
    
    // Count frequency of each character
    for (char c : str.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }
    
    // Print results
    System.out.println("Character Frequency:");
    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}