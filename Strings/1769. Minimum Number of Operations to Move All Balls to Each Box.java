class Solution {
    public int[] minOperations(String boxes) {
        
        int n = boxes.length();
        if(n == 1)
            return new int[] {0};
        
        int prefix[] = new int[n];
        int ones = boxes.charAt(0)=='1' ? 1 : 0;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + ones;
            if(boxes.charAt(i) == '1')
                ones++;
        }

        int suffix[] = new int[n];
        ones = boxes.charAt(n-1) == '1' ? 1 : 0;
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + ones;
            prefix[i] += suffix[i];
            if(boxes.charAt(i) == '1')
                ones++;
        }
        return prefix;
    }
}
/*
Time compleity - O(n)
Space complexity - O(n)
*/