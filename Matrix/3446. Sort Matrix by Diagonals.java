class Solution {
    public int[][] sortMatrix(int[][] grid) {
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<> ();
        int n = grid.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int key = i-j;
                if(map.containsKey(key))
                    map.get(key).add(grid[i][j]);
                else{
                    map.put(key, new ArrayList<Integer> ());
                    map.get(key).add(grid[i][j]);
                }
            }
        }
        for(int i: map.keySet()){
            ArrayList<Integer> list = map.get(i);
            if(i < 0)
                Collections.sort(list);
            else
                Collections.sort(list, Collections.reverseOrder());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int key = i-j;
                grid[i][j] = map.get(key).get(0);
                map.get(key).remove(0);
            }
        }
        return grid;
    }
}
/*
Time complexity - O(n^2 logn)
Space complexity - O(n^2)

Note : 
    -> Use row-col value as 'key'
*/