class Solution {
    public int minimumDeletions(String s) {
        int bcount = 0; int ans = 0;

        for(char c  : s.toCharArray()) {
            if(c == 'b') {
                bcount++;
            } else {
                ans = Math.min(ans+1, bcount);
            }
        }
        return ans;
    }
}