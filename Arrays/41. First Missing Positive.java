class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        if(n == 1){
            if(nums[0]==1) return 2;
            else return 1;
        }

        /*
        Approach 1 : Count Sort
        int count[] = new int[n+1];
        for(int i=0; i<n; i++){
            if(nums[i]>=1 && nums[i]<=n)
                count[nums[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(count[i] == 0)
                return i;
        }
        return n+1;
        */

        //Approach 2 : Cyclic Sort
        for(int i=0; i<n; i++){
            while(nums[i]>=1 && nums[i]<=n && nums[i]!=nums[nums[i]-1])
                swap(nums, i);
        }
        for(int i=0; i<n; i++){
            if(i+1 != nums[i])
                return i+1;
        }
        return n+1;
        
    }

    private static void swap(int[] nums, int i){
        int targetIndex = nums[i]-1;
        int temp = nums[i];
        nums[i] = nums[targetIndex];
        nums[targetIndex] = temp;
    }
}

/*
Approach 1 : Count Sort
    Time complexity - O(n)
    Space complexity - O(n)

Approach 2 : Cyclic Sort
    Time complexity - O(n)
    Space complexity - O(1)
*/