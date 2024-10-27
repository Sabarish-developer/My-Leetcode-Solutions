class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //Checking strs is null or empty
        if(strs==null || strs.length==0)
            return "";

        //Checking strs contain only 1 element
        if(strs.length == 1)
            return strs[0];

        //Finding length of smallest string
        int min_length = smallestString(strs);
        int i,j;
        
        outerloop:
        for(i=0; i<min_length; i++){
            char c = strs[0].charAt(i);
            for(j=1; j<strs.length; j++){
                if(strs[j].charAt(i) != c )
                    break outerloop;
            }
        }
        
        String result = strs[0].substring(0,i);
        return result;

    }


    public static int smallestString(String[] strs){

        int min=strs[0].length();
        for(String str: strs){
            if(str.length() < min)
                min = str.length();
        }
        return min;
    }
}

/*
Time complexity - O(n * m)  
    n - length of strs
    m - length of shortest string
Space complexity - O(1)

Steps : 
    -> Find length of shorest string for outerloop
    -> Iterate all strings in innerloop upto the shorest length and check is it equal
    -> If not break the outerloop
    -> Return substring of strs[0] upto i

*/
