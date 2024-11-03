class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){

            //Skipping duplicate values & i>0 is to avoid ArrayIndexOutOfBound error
            if(i>0 && nums[i]==nums[i-1])
                continue;

            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(total == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    //Skipping the duplicate values
                    while(j<k && (nums[j]==nums[j-1]))
                        j++;
                    while(j<k && (nums[k]==nums[k+1]))
                        k--;
                }
                else if(total < 0)
                    j++;
                else if(total > 0)
                    k--;

                }
            }

        return result;
       
    }
}

/*
Time complexity - O(n^2)
Space complexity - O(n)

Note : 
    -> Declaring List inside list : List<List<Integer>> result = new ArrayList<>();
    -> Returning list without declaring : return new ArrayList<>(result);

*/