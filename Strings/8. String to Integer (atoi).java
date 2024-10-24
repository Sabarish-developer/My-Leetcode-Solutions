class Solution {
    public int myAtoi(String s) {
        int length = s.length();
        if(length == 0)
            return 0;
        int index = 0;
        boolean is_negative = false;
        StringBuilder temp = new StringBuilder();
        String result;

        //1. Ignoring the whitespace
        while(index<length && s.charAt(index)==' '){
            index++;
        }

        //2 .Checking for - sign
        if(index<length && s.charAt(index) == '-'){
            is_negative = true;
            index++;
        }else if(index<length && s.charAt(index) == '+')
            index++;

        //3.Skip leading zeros   
        while(index<length && s.charAt(index)=='0'){
            index++;
        }

        //4. Reading the integer
        for(int i=index; i<length; i++){
            //char c = s.charAt(i);
            if(!Character.isDigit(s.charAt(i)))
                break;
            else
                temp.append(s.charAt(i));
        }

        if(temp.length() == 0)
            return 0;

        if(is_negative)
            result = "-".concat(temp.toString());
        else
            result = temp.toString();

        //5. Rounding the number
        try{
            int number = Integer.parseInt(result);
        }
        catch(Exception e){
            if(is_negative)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }

        int number = Integer.parseInt(result);
        if(number > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(number < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return number;

}
}
/*
Time complexity - O(n)
Space complexity - O(1)

Steps:
    -> Ignore all whitespaces
    -> Check sign only in next index of whitespace, if not then consider it as +ve
    -> Ignore all leading zeros
    -> Read all digits until non-digit
    -> parse to int , if error then automatically it exceeds so round it

Edge case : 
    "" -> check length of input if zero return 0
    " " -> while checking sign also check whether index < length
*/