class Solution {
    public int romanToInt(String s) {
                
        int length = s.length();
        int digit = length-1;
        int sum = 0;

        HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        if(length == 1){
            sum = roman.get(s.charAt(0));
            return sum;
        }

        while(digit > -1){
            //Subtraction case
            if(digit>0 && (roman.get(s.charAt(digit-1))<roman.get(s.charAt(digit)))){
                sum += roman.get(s.charAt(digit)) - roman.get(s.charAt(digit-1));
                digit -= 2;
            }
            else{
            //Addition case 
                sum += roman.get(s.charAt(digit));
                digit--;
            }
        }
        return sum; 
    }
}

/*
Note : 
    -> If current lettter < next letter then subtraction 
    -> Else do addition

Time complexity - O(n)
Space complexity - O(1)
*/