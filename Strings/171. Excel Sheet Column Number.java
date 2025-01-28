class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;
        int base = 1;
        for(int i=columnTitle.length()-1; i>=0; i--){
            char c = columnTitle.charAt(i);
            int value = c-'A'+1;
            result += base*value;
            base *= 26;
        }
        return result;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/