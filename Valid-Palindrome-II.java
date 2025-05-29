class Solution {

    // This method checks if a string can be a palindrome after at most one deletion.
    public boolean validPalindrome(String s) {
        // Iterate from both ends towards the center
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            // If two characters are not equal, try to skip a character either from left or right
            if (s.charAt(left) != s.charAt(right)) {
                // Check if the substring skipping one character on the left is a palindrome
                // or
                // Check if the substring skipping one character on the right is a palindrome
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        // If no mismatched characters found, it's already a palindrome
        return true;
    }

    // Helper method to check whether a substring defined by its indices is a palindrome
    private boolean isPalindrome(String s, int startIndex, int endIndex) {
        // Iterate over the substring
        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
            // If any pair of characters is not equal, it's not a palindrome
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        // No mismatches found, it's a palindrome
        return true;
    }
}
