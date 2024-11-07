class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0 || (x!=0 && x%10==0))
            return false;

        int reverse = 0;
        while(x > reverse){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return x==reverse || x==reverse/10;
    }
}
/*
Time complexity - O(log10 x)
Space complexity - O(1)

However if we take n as total number of digits, time complexity will be O(n) but for generally integer , that is not preferred.

Why x==reverse/10 ? 
    It is for odd digits , reverse = 123 and x = 12 means reverse will become 12.

Note : 
    Total digits = log10(x) + 1
*/