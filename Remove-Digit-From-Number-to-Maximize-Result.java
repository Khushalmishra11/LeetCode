class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        String result = "0";
        
        // Find all positions of the digit
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                // Remove the digit at current position and compare
                String candidate = number.substring(0, i) + number.substring(i + 1);
                // Update result if current candidate is larger
                if (candidate.compareTo(result) > 0) {
                    result = candidate;
                }
            }
        }
        
        return result;
    }
}