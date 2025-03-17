class Solution {
    public boolean divideArray(int[] nums) {
        
        int n = nums.length;
        if(n%2 == 1)
            return false;
        
        Set<Integer> set = new HashSet<> ();
        for(int i: nums){
            if(set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }
        return set.isEmpty();
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/