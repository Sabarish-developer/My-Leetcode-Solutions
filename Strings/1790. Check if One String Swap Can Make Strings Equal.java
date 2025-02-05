class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.length() != s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        if(s1.length()==1 || s2.length()==1)
            return s1.equals(s2);

        int count = -1;
        int[] indices = new int[s1.length()];
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 1)
                    return false;
                indices[count] = i;
            }
            
        }
        if(s1.charAt(indices[0])==s2.charAt(indices[1]) && s1.charAt(indices[1])==s2.charAt(indices[0]))
            return true;
        return false;
    }
}
/* 
Time complexity - O(n)
Space complexity - O(1)
*/