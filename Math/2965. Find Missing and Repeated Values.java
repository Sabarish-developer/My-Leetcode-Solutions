class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        long n = grid.length;
        long k = n*n; // k equals n^2
        long actualSum = k*(k+1)/2;
        long actualSquareSum = k*(k+1)*(2*k+1)/6;
        long sum = 0, squareSum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum += grid[i][j];
                squareSum += (grid[i][j]*grid[i][j]);
            }
        }
        int sumDifference = (int)(sum-actualSum); // x-y
        int squareSumDifference = (int)(squareSum-actualSquareSum); //x^2-y^2
        int missingWithRepeated = (int)(squareSumDifference/sumDifference); // x+y
        int missingNumber = (missingWithRepeated+sumDifference) / 2;
        int repeatedNumber = (missingWithRepeated-sumDifference) / 2;
        return new int[]{missingNumber, repeatedNumber};
    }
}
/*
Time complexity - O(n^2)
Space complexity - O(1)
*/