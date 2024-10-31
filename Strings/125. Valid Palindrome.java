class Solution {
    public boolean isPalindrome(String s) {

        /* Initial approach

        String input = s.trim().toLowerCase();
        if(input == "")
            return true;

        StringBuilder str = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(Character.isLetter(input.charAt(i)) || Character.isDigit(input.charAt(i)))
                str.append(input.charAt(i));
        }
        
        int left = 0;
        int right = str.length()-1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
        */

        // Optimized approach
        if(s.trim() == "")
            return true;

        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else{
                if(Character.toLowerCase(l) != Character.toLowerCase(r))
                    return false;
                left++;
                right--;
            }
           
        }
        return true;
    }
}

/*
Approach 1 :
    Time complexity - O(n)
    Space complexity - O(n)

Approach 2 :
    Time complexity - O(n)
    Space complexity - O(1)

*/