class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<> ();
        backtrack(candidates, target, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<Integer> (current));
            return;
        }
        if(index>=candidates.length || target<0) return;
        int currentElement = candidates[index];
        current.add(currentElement);
        backtrack(candidates, target-currentElement, index, current, result);
        current.remove(current.size()-1);
        backtrack(candidates, target, index+1, current, result);
    }
}

/*
Time complexity - O(2 ^ n)
Space complexity - O(n) for recursion stack plus O(2 ^ n) for storing results in worst case
*/