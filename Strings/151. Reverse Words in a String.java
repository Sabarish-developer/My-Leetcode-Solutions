class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            result.append(str[i]);
            if(i!=0)
                result.append(" ");
        }
        return result.toString();

    }
}

/*
Time compexity - O(n)
Space complexity - O(n)
    n - length of input string

Note : 
    String[] arr = input.split("\\s+")
    It will split one or more than one spaces.

    if we don't use we may get ["a", "good", , , "example"]

*/