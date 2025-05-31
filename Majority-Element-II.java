class Solution {
    /* Hashing
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i : nums){
          if(!map.containsKey(i)){
            map.put(i,1);
          }else{
            map.put(i,map.get(i)+1);
          }
        }
        for(int key : map.keySet()){
          if(map.get(key) > n){
            result.add(key);
          }
        }
        return result;
    } */
  public List<Integer> majorityElement(int[] nums) {
    int count1 = 0 , count2 = 0;
    Integer candidate1 = null, candidate2 = null;
    for(int num : nums){
      if(candidate1 != null && num== candidate1){
        count1++;
      }
      else if(candidate2 != null && num== candidate2){
        count2++;
      }else if(count1 == 0){
        candidate1 = num;
        count1 = 1;
      }else if(count2 == 0){
        candidate2 = num;
        count2 = 1;
      }else{
        count1--;
        count2--;
      }
    }

    count1 =0;
    count2 = 0;
    for(int num : nums){
      if(num == candidate1){
        count1++;
      }else if(num == candidate2){
        count2++;
      }
    }
    List<Integer> result = new ArrayList<>();
    if(count1 > nums.length / 3) result.add(candidate1);
    if(count2 > nums.length / 3) result.add(candidate2);
    return result;
  
  }


}