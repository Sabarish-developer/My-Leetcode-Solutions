class Solution {
    public boolean checkString(String s) {
        
        if(s.length() < 2)
            return true;
        boolean b = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b')
                b = true;
            if(b && s.charAt(i)=='a')
                return false;
        }
        return true;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/