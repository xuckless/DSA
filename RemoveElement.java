public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) return 0;
    
    int k = 0;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] != val){
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
  
  public static void main(String[] args) {
    RemoveElement re = new RemoveElement();
    
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    
    int c = re.removeElement(nums, 1);
    
    for (int i : nums){
      System.out.print(i + ", ");
    }
    System.out.println("\n"+c);
  }
}
