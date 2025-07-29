class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length * 2];
        int index =0;
        for(int i = 0; i<nums.length; i++){
            concat[index++] = nums[i]; 
        }
        for(int i=0; i< nums.length; i++){
            concat[index++] = nums[i]; 
        }
        return concat;
    }
}