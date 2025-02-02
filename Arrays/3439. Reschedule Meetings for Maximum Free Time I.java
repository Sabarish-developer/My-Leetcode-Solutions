class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {

        int n = startTime.length;
        int[] gaps = new int[n+1]; // 'n' meetings will have 'n+1' gaps
        gaps[0] = startTime[0]; // gap before first meeting
        for(int i=1; i<n; i++)
            gaps[i] = startTime[i]-endTime[i-1];
        gaps[n] = eventTime-endTime[n-1]; // gap after last meeting


        int windowSize = k+1; // Rescheduling k meetings merges k+1 gaps
        //If we join 1 meeting , we join 2 gaps
        //If we join 2 meetinngs, we join 3 gaps

        int currentWindowGap = 0, longestGap = 0;
        for(int i=0; i<windowSize; i++)
            currentWindowGap += gaps[i];
        longestGap = currentWindowGap;

        
        //Sliding window technique
        //Finding maximum sum subarray of windowSize(k+1)
        //Since we are merging gaps we should take sum of them
        //If we can merge k+1 gaps then maximum sum of size k+1
        for(int i=windowSize; i<n+1; i++){
            currentWindowGap = currentWindowGap + gaps[i] - gaps[i-windowSize];
            longestGap = Math.max(longestGap, currentWindowGap);
        }
        return longestGap;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/