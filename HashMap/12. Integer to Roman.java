class Solution {
    public String intToRoman(int num) {
        
        HashMap<Integer,Character> roman = new HashMap<> ();
        roman.put(1, 'I');
        roman.put(5, 'V');
        roman.put(10, 'X');
        roman.put(50, 'L');
        roman.put(100, 'C');
        roman.put(500, 'D');
        roman.put(1000, 'M');

        StringBuilder result = new StringBuilder();
        int digit = (int)Math.log10(num)+1 ;
        digit = (int)Math.pow(10,digit-1);

        while(num > 0){
            int quo = num/digit;
            int rem = quo * digit;

            if(quo==1 || quo==5)
                result.append(roman.get(quo*digit));
            else if(quo==4 || quo==9){
                result.append(roman.get(1*digit));
                result.append(roman.get((quo+1)*digit));
            }
            else{
                while(quo > 0){
                    if(quo > 5){
                        result.append(roman.get(5*digit));
                        quo = quo-5;
                    }
                    else{
                        result.append(roman.get(1*digit));
                        quo--;
                    }
                }
            }
            num = num%digit;
            digit /= 10;
        }
        return result.toString();
    }
}

/*
Time complexity - O(1)
Space complexity - O(1)
*/