class Solution {

    //  Optimized solution 
    public int pivotIndex(int[] nums){
        int sum = 0;
        for( int i: nums){
            sum = sum + i;
        }
        int leftSum =0;
        for(int i = 0; i< nums.length; i++){
            int rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i; //pivot element
            }
            leftSum = leftSum + nums[i]; 
        }
        return -1;

    }

// Brute force approach with complexity errors
    public int pivotIndexBruteForce(int[] nums) {
        for(int i =0 ; i< nums.length; i++){
            //  for left sum
            int leftSum = 0;
            for(int j =0; j < i; j++){
                leftSum = leftSum + nums[j];
            }
            int rightSum =0; 
            for(int j = i+1; j < nums.length;j++){
                rightSum = rightSum + nums[j];
            }
            if(leftSum == rightSum)
            return i;
        }
        return -1;
    }
}