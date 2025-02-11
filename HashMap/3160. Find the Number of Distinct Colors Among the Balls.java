class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
        int n = queries.length;
        Map<Integer, Integer> coloredBalls = new HashMap<> ();
        Map<Integer, Integer> colorCount = new HashMap<> ();
        int result[] = new int[n];
        for(int i=0; i<n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            
            if(coloredBalls.containsKey(ball)){ // Ball already has some color, replace it
                int oldColor = coloredBalls.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor)-1); // Removing ball from old color list
                if(colorCount.get(oldColor) == 0) // If the old color has no balls, remove it
                    colorCount.remove(oldColor);
            }
            coloredBalls.put(ball,color); //Now assigning new Color to the ball
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1); // Increasing in color count by 1
            result[i] = colorCount.size();
        }
        return result;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/