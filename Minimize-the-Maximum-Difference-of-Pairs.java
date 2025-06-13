class Solution {
     public int minimizeMax(int[] nums, int pairsToForm) {
        // Sort the array to prepare for binary search
        Arrays.sort(nums);
        // Number of elements in the array
        int arrayLength = nums.length;
        // Initialize binary search bounds
        int left = 0;
        int right = nums[arrayLength - 1] - nums[0] + 1;
      
        while (left < right) {
            int mid = (left + right) >>> 1; // Mid-point using unsigned bit-shift to avoid overflow
            if (countPairsWithDifference(nums, mid) >= pairsToForm) {
                right = mid;
            } else { // Otherwise, go to right half
                left = mid + 1;
            }
        }
        return left;
    }

    private int countPairsWithDifference(int[] nums, int maxDifference) {
        int pairCount = 0; 
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i + 1] - nums[i] <= maxDifference) {
                pairCount++;
                i++; 
            }
        }
        return pairCount;
    }
}