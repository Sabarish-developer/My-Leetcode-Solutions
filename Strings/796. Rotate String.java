class Solution {
    public boolean rotateString(String s, String goal) {
        
        //Approach 1 : Make all rotations and check
        /*
        if(s.equals(goal))
            return true;
        if(s.isEmpty() && !goal.isEmpty())
            return false;
        else if(goal.isEmpty() && !s.isEmpty())
            return false;
        
        char[] array = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char last = array[array.length-1];
            for(int j=array.length-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
            if( String.valueOf(array).equals(goal) )
                return true;
        }
        return false;
        */

        //Approach 2 : Concatenation s+s
        if(s.length() != goal.length())
            return false;
        return (s+s).contains(goal);
    }
}

/*
Approach 1 : 
    Time complexity - O(n^2)
    Space comlpexity - O(n)

Approach 2 :
    Time complexity - O(n)
    Space complexity - O(n)

Note : 
    -> When a string is concatenated with itself, the result will contains all possible rotations of the string.

How strobject.contains() method has O(n) complexity?
    -> Refer Knuth-Morris-Pratt, Rabin Karp and other algorithms.

*/