class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);
        String maxNumStr = numStr;
        String minNumStr = numStr;

        for (int i = 0; i < numStr.length(); ++i) {
            if (numStr.charAt(i) != '9') {
                maxNumStr = numStr.replace(numStr.charAt(i), '9');
                break;
            }
        }

        if (minNumStr.charAt(0) != '1') {
            minNumStr = minNumStr.replace(minNumStr.charAt(0), '1');
        } else {
            for (int i = 1; i < minNumStr.length(); ++i) {
                if (minNumStr.charAt(i) != '0' && minNumStr.charAt(i) != '1') {
                    minNumStr = minNumStr.replace(minNumStr.charAt(i), '0');
                    break;
                }
            }
        }
      
        return Integer.parseInt(maxNumStr) - Integer.parseInt(minNumStr);
    }
}