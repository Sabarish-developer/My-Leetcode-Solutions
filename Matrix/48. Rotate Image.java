class Solution {
    public void rotate(int[][] matrix) {

        if(matrix==null || matrix[0].length!=matrix.length)
            return;
        
        int l = matrix[0].length;
        int top = 0;
        int down = l-1;

        //Reversing vertically
        while(top < down){
            for(int col=0; col<l; col++){
                int temp = matrix[top][col];
                matrix[top][col] = matrix[down][col];
                matrix[down][col] = temp;
            }
            top++;
            down--;
        }
        //Transpose the matrix 
        //Ignore diagonal and choose upper triangle because iterating is easier
        for(int row=0; row<l; row++){
            for(int col=row+1; col<l; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        return;
    }
}

/*
Time complexity - O(n^2)
Space compexity - O(1)
*/