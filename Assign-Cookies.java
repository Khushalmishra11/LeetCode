1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int left = 0, right = 0;
4        int n = s.length, m = g.length;
5        Arrays.sort(g);
6        Arrays.sort(s);
7        while(left < n && right < m){
8            if(s[left] >= g[right]){
9                right++;
10            }
11            left++;
12        }
13        return right;
14    }
15}