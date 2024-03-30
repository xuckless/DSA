import java.util.Stack;

public class ValidParanthesis {
  public boolean isValid2(String s) {
    boolean isTrue = false;
    for (int i = 0; i < s.length() - 1; i++){
      if (i % 2 == 0 && (s.charAt(i) == ')' || s.charAt(i) ==']' ||s.charAt(i) == '}')) {
        return false;
      }
      if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
        isTrue = true;
      }
      if(s.charAt(i) == '[' && s.charAt(i+1) == ']'){
        isTrue = true;
      }
      if(s.charAt(i) == '{' && s.charAt(i+1) == '}'){
        isTrue = true;
      }
    }
    return isTrue;
  }
  
  public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    
    for (char c : s.toCharArray()){
      if (c == '(' || c == '{' || c =='['){
        stack.push(c);
      } else {
        if (stack.isEmpty()) return false;
        if (c == ')' && stack.pop() != '(') return false;
        if (c == '}' && stack.pop() != '{') return false;
        if (c == ']' && stack.pop() != '[') return false;
      }
    }
    return stack.empty();
  }
  
  public static void main(String[] args) {
    String ex = "()))";
    
    boolean isTrue = false;
    if(ex.charAt(0) == '(' && ex.charAt(1) == ')'){
    
    }
    
    for (int i = 0; i < ex.length() - 1; i++){
      if (ex.indexOf('(') < ex.indexOf(')')){
        isTrue = true;
      }
    }
    
    
    System.out.println(isTrue);
  }
}
