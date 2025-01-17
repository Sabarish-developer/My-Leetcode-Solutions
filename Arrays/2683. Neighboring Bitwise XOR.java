class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
        int ans = 0;
        for(int i: derived){
            ans ^= i;
        }
        return ans == 0;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)

Note : 
    -> Each element is Xored twice , so derived array xored should be 0.
*/