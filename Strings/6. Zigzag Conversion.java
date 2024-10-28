class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1 || s.length()==1 || numRows>=s.length())
            return s;

        //Approach 1 : Brute force using Char 2D array
        /*char[][] array = new char[numRows][((s.length())/2)+1];
        int row = 0;
        int col = 0;
        int index = 0;
        outerloop:
        while(true){
            for(int i=0; i<numRows; i++){
                if(index == s.length())
                    break outerloop;

                array[row][col] = s.charAt(index++);
                row++;
            }
            row--;
            for(int j=0; j<numRows-2; j++){
                if(index == s.length())
                    break outerloop;

                row--;
                col++;
                array[row][col] = s.charAt(index++);
            }
            row--;
            col++;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows; i++){
            for(int j=0; j<(s.length()/2)+1; j++){
                if(array[i][j] != '\u0000')
                    result.append(array[i][j]);
            }
        }
        return result.toString();*/

        //Appraoch 2 : Optimized 

        StringBuilder rows[] = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++)
            rows[i] = new StringBuilder();

        int row = 0;
        boolean godown = false;

        for(int i=0; i<s.length(); i++){
            rows[row].append(s.charAt(i));
            if(row == 0 || row==numRows-1)
                godown = !godown;

            if(godown)
                row++;
            else
                row--;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder r: rows){
            result.append(r);
        }
        return result.toString();
    }
}

/*
Approach 1: 2D Char array
    Time complexity - O(n)
    Space complexity - O(n * numRows)

Approach 2: 1D StringBuilder array
    Time complexity - O(n)
    Space complexity - O(n)

why we have to give rows[i] = new StringBuilder() initially itself we declared rows as stringBuilder array?

Array Declaration vs. Object Initialization:
When we declare StringBuilder[] rows = new StringBuilder[numRows];, Java allocates memory for an array that can hold numRows references to StringBuilder objects. However, all elements in this array are initially null because we haven't created any actual StringBuilder instances yet.

Initializing Each StringBuilder Object:
rows[i] = new StringBuilder(); creates a new StringBuilder object for each row and assigns it to each index of the rows array.
Without this line, rows[i] would be null, and attempting to call rows[i].append(c) on it would throw a NullPointerException

*/