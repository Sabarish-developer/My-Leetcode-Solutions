class Solution {
    public int prefixCount(String[] words, String pref) {
        
        /*
        int count = 0;
        int prefLength = pref.length();
        for(int i=0; i<words.length; i++){
            String s = words[i];
            if(s.length()>=prefLength && pref.equals(s.substring(0,prefLength)))
                count++;
        }
        return count;
        */

        int count = 0;
        for(String s: words){
            if(s.startsWith(pref))
                count++;
        }
        return count;
    }
}
/*
Time complexity - O(n * m) where m - length of prefix
Space complexity - O(1)

Note : 
    -> str.startsWith()
    -> str.endsWith() 
*/