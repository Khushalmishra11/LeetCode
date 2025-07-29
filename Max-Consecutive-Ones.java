class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int counter = 0;
        for(int i : nums){
            if(i == 1){
                count++;
            }else if(i != 1){
                counter = Math.max(count, counter);
                count = 0;
            }
        }
        return Math.max(count,counter);
    }
}