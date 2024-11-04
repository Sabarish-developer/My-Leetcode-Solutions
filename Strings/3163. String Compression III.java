class Solution {
    public String compressedString(String word) {
        
        if(word.length() == 1)
            return "1".concat(word);
        
        StringBuilder str = new StringBuilder();
        int count = 1;
        int length = word.length();
        char lastchar = word.charAt(0);
        for(int i=1; i<length; i++){
            if(word.charAt(i) == lastchar && count<9){
                count++;
            }else{
                str.append(count).append(lastchar);
                count = 1;
                lastchar = word.charAt(i);
            }
           
        }
        str.append(count).append(lastchar);
        return str.toString();
    }
}

/*
Time complexity - O(n)
Space complexity - O(n)
*/