import java.util.Arrays;

public class RemoveDuplicatesFromArray {
  public int removeDuplicates1(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length ; i++){
      for (int j = i + 1; j< nums.length -1; j++){
        if (nums[j] == nums[i]){
          nums[j] = Integer.MAX_VALUE;
          counter++;
        } else{
          break;
        }
      }
    }
    return counter;
  }
  
  public int removeDuplicates(int[] nums){
    int k = 1;
    
    for (int i = 1; i < nums.length; i++){
      if (nums[i] != nums[i-1]){
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
  
  public static void main(String[] args) {
    RemoveDuplicatesFromArray rdc = new RemoveDuplicatesFromArray();
    
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    
    int c = rdc.removeDuplicates(nums);
    
    for (int i : nums){
      System.out.print(i + ", ");
    }
    System.out.println("\n"+c);
  }
}
