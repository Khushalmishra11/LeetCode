1class Solution {
2    public void rotate(int[][] matrix) {
3        int size = matrix.length;
4        for(int i = 0; i < size; i++){
5            for(int j = i+1; j < size; j++){
6                swap(matrix, i ,j);
7            }
8        }
9        for(int i = 0; i < size; i++){
10            reverse(matrix, i);
11        }
12    }
13    private void swap(int[][] matrix, int i , int j){
14        int temp = matrix[i][j];
15        matrix[i][j] = matrix[j][i];
16        matrix[j][i] = temp;
17    }
18    private void reverse(int[][] matrix, int i){
19        int left = 0, right = matrix.length - 1;
20
21        while(left<= right){
22            int temp = matrix[i][left];
23            matrix[i][left] = matrix[i][right];
24            matrix[i][right] = temp;
25            left++;
26            right--;
27        }
28    }
29}