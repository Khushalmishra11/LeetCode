1class Solution {
2    private void swap(int[][] matrix, int i , int j){
3        int temp = matrix[i][j];
4        matrix[i][j] = matrix[j][i];
5        matrix[j][i]= temp;
6    }
7    private void reverse(int[][] matrix, int i){
8        int left = 0 , right = matrix.length-1;
9        while(left <= right){
10            int temp = matrix[i][left];
11            matrix[i][left] = matrix[i][right];
12            matrix[i][right] = temp;
13            left++;
14            right--;
15        }
16    }
17    public void rotate(int[][] matrix) {
18        int size = matrix.length;
19        for(int i = 0; i < size; i++){
20            for(int j = i+1; j<size; j++){
21                swap(matrix, i , j);
22            }
23        }
24        for(int i = 0; i < size; i++){
25            reverse(matrix, i);
26        }
27    }
28}