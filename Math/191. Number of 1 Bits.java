class Solution {
    public int hammingWeight(int n) {
        
        int count = 0;
        while(n > 0){
            if((n&1) == 1)
                count++;
            n = n >>> 1;
        }
        return count;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)

Note : 
    -> Use >>> since, it fills left most bit with 0 regardless of sign.
*/