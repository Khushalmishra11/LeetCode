class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k ==1) return 0;
        int difference = Integer.MAX_VALUE;
        int left = 0;
        int right = k-1;
        while(right < nums.length){
            int current = nums[right] - nums[left];
            difference = Math.min(difference, current);
            left++;
            right++;

        }
        return difference;
    }
}