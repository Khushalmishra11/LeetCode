class Solution {
    public int reverse(int x) {
        int revNum = 0, lastDigit= 0;
        while( x != 0)
        {
            if(revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10){
                return 0;
            }
            lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x = x/10;
        }
        return revNum;
    }
}