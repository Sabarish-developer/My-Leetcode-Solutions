class Solution {
    public String clearDigits(String s) {
        
        Stack<Character> stack = new Stack<> ();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9')
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder str = new StringBuilder();
        while(stack.size() > 0){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/