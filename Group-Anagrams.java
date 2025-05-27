class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String , List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chrs = word.toCharArray();
            Arrays.sort(chrs);
            String sorted = new String(chrs);

            if(!map.containsKey(sorted)){
                map.put(sorted , new ArrayList<>());
            }

            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}