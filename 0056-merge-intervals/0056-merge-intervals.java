class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;

        // sort the start
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> merged = new ArrayList<>();

        // iterate
        int[] current = intervals[0];

        for(int i = 1; i< intervals.length; i++) {
            int[] next = intervals[i];

            if(current[1] >= next[0] ) {
                // overlap -> merge
                current[1] = Math.max(current[1],next[1]);
            } else {
                // no overlap ->add current
                merged.add(current);
                current = next;
            }
        }
       // add last interval
        merged.add(current);
        // convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}