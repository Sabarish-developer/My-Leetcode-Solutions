class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<> ();
        hp.put(nums[0],0);
        for(int i=1; i<nums.length; i++){
            if(hp.getOrDefault(target-nums[i],-1) > -1)
                return new int[] {hp.get(target-nums[i]),i};
            else
                hp.put(nums[i],i);
        }
        return null;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)

Note : 
    -> Hashmap is better if the array is not sorted , if sorted then use Twopointers.
*/