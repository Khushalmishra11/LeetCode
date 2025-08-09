class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long result = 0;
        int[] lastPos = new int[26];  // Store last position of each character
        Arrays.fill(lastPos, -1);  // Initialize with -1
        
        // Calculate contribution of each character to total appeal
        for (int i = 0; i < n; i++) {
            int currentChar = s.charAt(i) - 'a';
            // Current position contribution = (i - lastPos[currentChar]) * (n - i)
            result += (long)(i - lastPos[currentChar]) * (n - i);
            lastPos[currentChar] = i;
        }
        
        return result;
    }
}