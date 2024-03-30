public class SearchInsertPosition {
  public int searchInsert2(int[] nums, int target) {
    int k = 0;
    
    if (target > nums[0]) return 0;
    
    for (int i = 0; i < nums.length; i++){
      if (nums[i] != target){
        if (target > nums[i]){
          k++;
        }
        else if (target < nums[i]) {
          k = i -2;
        }
      }
      if (nums[i] == target) {
        return i;
      }
    }
    return k;
  }
  
  public int searchInsert3(int[] nums, int target) {
    
    for (int i = 0; i < nums.length; i++) {
      if (target > nums[i]) {
        return i+1;
      }
      if (target == nums[i]) {
        return i;
      }
    }
    return nums.length + 1;
  }
  
  public int searchInsert(int[] nums, int target){
    int left = 0;
    int right = nums.length -1;
    
    while (left <= right){
      int middle = left - (right - left) / 2;
      
      if (nums[middle] == target){
        return middle;
      }
      else if (nums[middle] < target){
        left = middle + 1;
      }
      else {
        right = middle - 1;
      }
    }
    return left;
  }
}
