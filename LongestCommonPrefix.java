public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    
    String prefix = strs[0];
    
    for (int i = 0; i < strs.length; i++){
      while (strs[i].indexOf(prefix) != 0){
        prefix = prefix.substring(0, prefix.length() -1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }
  
  
  
  
  public static void main(String[] args) {
    String o = "Hello";
    String k = "Hell";
    String l = "";
    
    for (int i = 0, j = 0; i < o.length() && j < k.length(); i++, j++){
      if (o.charAt(i) == k.charAt(j)){
        l += o.charAt(i);
      }
    }
    
    System.out.println(l);
  }
}
