class Solution {
    public int minimumCardPickup(int[] cards) {
        // Use HashMap to store the most recent index of each card value
        HashMap<Integer, Integer> lastIndex = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        
        // Iterate through the array once
        for (int i = 0; i < cards.length; i++) {
            // If we've seen this card before
            if (lastIndex.containsKey(cards[i])) {
                // Calculate length between current and last occurrence
                // Add 1 because we need to include both cards
                minLength = Math.min(minLength, i - lastIndex.get(cards[i]) + 1);
            }
            // Update the last index of current card
            lastIndex.put(cards[i], i);
        }
        
        // Return -1 if no matching pair found, otherwise return minLength
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}