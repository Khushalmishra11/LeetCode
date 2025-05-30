class Solution {
    public void rotate(int[] nums, int k) {
        int first = 0;
        int last = nums.length -1;
        k = k % nums.length;
        
        reverse(nums, first, last);
        reverse(nums, first, k-1);
        reverse(nums, k, last);
    }
    private void reverse(int[] nums, int first, int last){
      while(first < last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        ++first;
        --last;
      }
    }
}