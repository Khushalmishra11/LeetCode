class Solution {
  /* hashing approach
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
          if(!map.containsKey(i)){
            map.put(i,1);
          }else{
            map.put(i,map.get(i)+1);
          }
            if(map.get(i) > n) return i;
        }
        return 0;
    } */

    // Boyer moore algorithm
    public int majorityElement(int[] nums) {
      int count =0, candidate = 0;
      for(int num : nums){
        if(count == 0){
          candidate = num;
        }
          count += (num == candidate) ?1 : -1;
      }
      return candidate;
    }
}