class Solution {
    public int maxArea(int[] height) {
     /* int max =0;
        for(int i =0; i < height.length; i++){
          for(int j=0; j<height.length; j++){
            int h = Math.min(height[i], height[j]);
            int w = j-1;
            int area = h * w;
            max = Math.max(area,max)
          }
        }
        return max */  //Aporach !: brute force approach.

      int left = 0;
      int right = height.length-1;
      int max = 0;
      while(left <right){
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        int area = h * w;
        max = Math.max(area, max);

        if(height[left]< height[right]){
          left++;
        }
        else{
          right--;
        }
      }
      return max;

    }
}