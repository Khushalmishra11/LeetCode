class Solution {
    public boolean isAnagram(String s, String t) {
        int[] set = new int[30];
        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            set[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            set[c - 'a']--;
            if(set[c-'a'] < 0) return false;
        }
        return true;
    }
}