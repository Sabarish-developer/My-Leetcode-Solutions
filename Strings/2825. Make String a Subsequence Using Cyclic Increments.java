class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        
        int str1_pointer = str1.length()-1;
        int str2_pointer = str2.length()-1;
        while(str1_pointer>=0 && str2_pointer>=0){
            char c2 = str2.charAt(str2_pointer);
            char c1 = str1.charAt(str1_pointer);
            if(c2==c1 || c2==(c1+1)){
                str2_pointer--;
                str1_pointer--;
            }
            else if(c2=='a' && c1=='z'){
                str2_pointer--;
                str1_pointer--;
            }
            else
                str1_pointer--;
        }
        if(str2_pointer < 0)
            return true;
        else
            return false;
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)
*/