class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        
        int l = arr.length;
        int rows = mat.length;
        int cols = mat[0].length;
        int position[][] = new int[l+1][2];

        //Pre-processing to store elements row and col in position array
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int element = mat[i][j];
                position[element][0] = i;
                position[element][1] = j;
            }
        }

        //Freq arrays to track number of values painted in that particular row or col
        int rowFreq[] = new int[rows];
        int colFreq[] = new int[cols];

        for(int i=0; i<l; i++){
            int e = arr[i];
            int r = position[e][0];
            int c = position[e][1];
            rowFreq[r]++;
            colFreq[c]++;
            if(rowFreq[r]==cols || colFreq[c]==rows)
                return i;
        }
        return -1;
    }
}

/*
Time complexity - O(n * m)
Space complexity - O(n + m)
*/