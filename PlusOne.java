public class PlusOne {
  public int[] plusOne1(int[] digits) {
    String j = "";
    for (int i = 0; i < digits.length; i++){
      j += String.valueOf(digits[i]);
    }
    j = String.valueOf(Integer.valueOf(j)+1);
    int[] plusOne = new int[j.length()];
    for (int i = 1; i < j.length(); i++){
      plusOne[i] = Integer.valueOf(j.charAt(i));
    }
    return plusOne;
  }
  public int[] plusOne(int[] digits) {
    int[] newInt = digits;
    int last = newInt.length-1;
    
    for (int i = last; i >= 0; i--){
      if (newInt[last] < 9){
        newInt[last] ++;
        return newInt;
      }
      digits[i] = 0;
    }
    int[] newDigits = new int[newInt.length+1];
    newDigits[0]=1;
    return newDigits;
  }
}
