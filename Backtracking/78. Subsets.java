class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<> ();
        backtrack(nums, 0, new ArrayList<Integer>(), subsets);

        //Sorting based on size, if equal then compare first element
        /*
        subsets.sort( (list1,list2) -> {
            if(list1.isEmpty()) return -1;
            if(list2.isEmpty()) return -1;
            int compareSize = Integer.compare(list1.size(), list2.size());
            if(compareSize == 0){
                return Integer.compare(list1.get(0), list2.get(0));
            }
            return compareSize;
        });
        */

        return subsets;
    }

    private static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets){

        //Base case
        if(index == nums.length){
            subsets.add(new ArrayList<Integer> (current));
            return;
        }
        //Including the current number
        current.add(nums[index]);
        backtrack(nums, index+1, current, subsets);

        //Excluding the current number
        current.remove(Integer.valueOf(nums[index]));
        backtrack(nums ,index+1, current, subsets);
    }
}
/*
Time complexity - O(2^n * n)
Space complexity - O(2^n * n)
*/