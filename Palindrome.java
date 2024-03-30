import javax.print.DocFlavor;

public class Palindrome {
  public boolean isPalindrome2(int x) {
    String xS = String.valueOf(x);
    String xSr = "";
    for (int i = xS.length() - 1; i >= xS.length() / 2; i--) {
      xSr += xS.charAt(i);
    }
    return xS.equals(xSr);
  }
  
  private boolean isPalindrome5(int x){
    if (x < 0 || (x % 10 == 0 && x != 0)){
      return false;
    }
    int revertedNo = 0;
    while (x > revertedNo){
      revertedNo = revertedNo * 10 + x % 10;
      x /= 10;
    }
    return x == revertedNo || x == revertedNo / 10;
  }
}