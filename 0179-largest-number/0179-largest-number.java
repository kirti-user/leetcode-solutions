class Solution {
    public String largestNumber(int[] nums) {
        // convert integer to String
        String[] arr = new String[nums.length];

        for(int i = 0; i< nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        // Custom sort with comparator
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

       // handle all edge cases of zeroes
        if(arr[0].equals("0")) {
            return "0";
        }
        // concat all strings
       StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s);
        }
       // convert stringBuilder to string
        return sb.toString();
    }
}