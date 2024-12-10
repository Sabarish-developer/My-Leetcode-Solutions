class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<> ();
        int result;
        String operator = "+-*/";

        for(String token : tokens){
            if(! operator.contains(token)){ // If token is not equal to "+", "-", "*", "/" then push it in stack.
                stack.push(Integer.parseInt(token));
                //System.out.println(stack.toString());
            }
            else{
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                result = calculate(operand1, operand2, token);
                stack.push(result);
                //System.out.println(stack.toString());
            }
        }
        return stack.pop();
    }

    public static int calculate(int a, int b, String operator){
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        return -1;
    }
}

/*
Time complexity - O(n)
Space complexity - O(n)
*/