public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    String[] words = s.split("\\s+");
    int j = words.length - 1;
    return words[j].length();
  }
}
