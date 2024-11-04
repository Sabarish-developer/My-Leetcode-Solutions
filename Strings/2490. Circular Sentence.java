class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] str = sentence.split(" ");
        
        if(str.length == 1 && (str[0].charAt(0) == str[0].charAt(str[0].length()-1)))
            return true;

        //boolean circular = true;
        for(int i=0; i<str.length-1; i++){
            if((str[i].charAt(str[i].length()-1)) != (str[i+1].charAt(0)))
                return false;
        }
        if((str[str.length-1].charAt(str[str.length-1].length()-1)) != (str[0].charAt(0)))
            return false;
        
        return true;

    }
}

/*
Time complexity - O(n)
Space complexity - O(n)

Note : 
    int index = string.indexOf(" ",6) - It will search from 6th index.
*/