class Solution {
    public String makeFancyString(String s) {
        
        if(s.length() < 3)
            return s;

        StringBuilder str = new StringBuilder();
        /*int count = 1;
        char lastchar = s.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==lastchar){
                count++;
                if(count == 3){
                    str.deleteCharAt(i);
                    count--;
                    i--;
                }
            }
            else{
                count = 1;
                lastchar = str.charAt(i);
            }
        }*/
        str.append(s.charAt(0)).append(s.charAt(1));
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1) || s.charAt(i)!=s.charAt(i-2))
                str.append(s.charAt(i));
        }

        return str.toString();

    }
}
/*
Time complexity - O(n)
Space complexity - O(n)

Note : 
    str.deleteCharAt(i) - but be careful if you delete an index , next index becomes the deleted index.
*/