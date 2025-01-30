class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            int rem = columnNumber % 26;
            if(rem != 0){
                char c = (char)(64 + rem);
                s.append(c);
            }
            else{
                s.append('Z');
                columnNumber--; //Otherwise the number will become zero.
            }
            columnNumber /= 26;
        }
        return s.reverse().toString();
    }
}
/*
Time complexity - O(log n)
Space complexity - O(1)
*/