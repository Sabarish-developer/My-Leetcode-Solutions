class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {

        int rows = grid.length;
        int col = grid[0].length;
        int colStart = col%2==0 ? col-1 : col-2;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<rows; i++){
            if(i%2 == 0){
                for(int j=0; j<col; j+=2)
                        list.add(grid[i][j]);
            }
            else{
                for(int j=colStart; j>=0; j-=2)
                        list.add(grid[i][j]);
            }
        }
        return list;
    }
}
/*
Time complexity - O(m * n)
Space complexity - O(m * n)
*/