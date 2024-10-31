class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int s_pointer = 0;
        int t_pointer = 0;

        while(s_pointer<=s.length() && t_pointer<=t.length()){

            if(s_pointer == s.length())
                return true;
            if(t_pointer == t.length())
                return false;
            if(t.charAt(t_pointer) == s.charAt(s_pointer)){
                t_pointer++;
                s_pointer++;
            }
            else
                t_pointer++;
        }
        return false;
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)

Further Optimization : 

int s_pointer = 0;
int t_pointer = 0;
while(s_pointer<s.length() && t_pointer<t.length()){
    if(t.charAt(t_pointer) == s.charAt(s_pointer))
        s_pointer++;
    t_pointer++;
    }
    return s_pointer == s.length();

*/