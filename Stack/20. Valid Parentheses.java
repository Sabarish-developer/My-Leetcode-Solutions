class Solution {
    public boolean isValid(String s) {

        if(s.length() == 1)
            return false;

        Stack<Character> stack = new Stack<> ();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='{' || c=='[' || c=='(')
                stack.push(c);
            else{
                if(stack.empty() || !matchingPair(stack.pop(), c))
                    return false;
            }
        }
        return stack.empty();
    }

    public static boolean matchingPair(char open, char close){
        char c = 'a';
        if(open == '(')
            c = ')';
        else if(open == '[')
            c = ']';
        else if(open == '{')
            c = '}';
        return c == close;
    }
}

/*
Time complexity - O(n)
Space complexity - O(n)
*/
