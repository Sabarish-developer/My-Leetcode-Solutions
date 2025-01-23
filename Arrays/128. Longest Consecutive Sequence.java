class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        if(nums.length == 1) return 1;

        HashSet<Integer> set = new HashSet<>();
        for(int i: nums)
            set.add(i);
        int count = 1, longest = 0;
        for(Integer i: set){
            if(!set.contains(i-1)){
                int currentNum = i;
                count = 1;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum += 1;
                }
            }
            longest = count>longest ? count : longest;
        }
        return longest;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)

Note : 
    -> Check whether the current element is start of a sequence by checking set.contains(prev)
*/