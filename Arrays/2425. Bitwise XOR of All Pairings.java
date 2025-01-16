class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int l1 = nums1.length;
        int l2 = nums2.length;
        int ans = 0;
        if(l1%2==0 && l2%2==0)
            ans = 0;
        else if(l1%2==0 && l2%2!=0){
            for(int i=0; i<l1; i++)
                ans ^= nums1[i];
        }
        else if(l1%2!=0 && l2%2==0){
            for(int i=0; i<l2; i++)
                ans ^= nums2[i];
        }
        else{
            for(int i=0; i<l1; i++) 
                ans ^= nums1[i];
            for(int j=0; j<l2; j++)
                ans ^= nums2[j];
        }
        return ans;
    }
}
/*
Time complexity - O(n + m)
Space complexity - O(1)

Note : 
    -> Xor of a number with itself is 0, so even number of times a number is Xored it is 0.
*/