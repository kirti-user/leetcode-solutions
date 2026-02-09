class Solution {
    public int dominantIndices(int[] nums) {
       int rightlen = 0;    // no. of elements to the right
       int rightSum = 0;    // sum of elements to the right
       int dominant = 0     ;

       for(int i = nums.length-1; i >= 0; i--) {
        if(rightlen > 0 && nums[i] * rightlen > rightSum) {
            dominant++;
        }

        rightSum += nums[i];
        rightlen++;
       }

       return dominant;
    }
}