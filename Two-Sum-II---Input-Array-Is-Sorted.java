class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 ;
        int j = numbers.length - 1;
        while(i<j){
            int result = numbers[i] + numbers[j];
            if(result == target){
                return new int[]{i+1,j+1};
            }else if(result > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}