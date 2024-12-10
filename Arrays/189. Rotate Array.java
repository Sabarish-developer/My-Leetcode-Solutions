class Solution {
    public void rotate(int[] nums, int k) {
        
        int l = nums.length;
        k = k % l;
        if(k==0 || l==1)
            return;
        
        /*
        int[] arr = new int[k];
        int index = -1;
        for(int i=l-k; i<l; i++)
            arr[++index] = nums[i];
        for(int i=l-1; i>=k; i--)
            nums[i] = nums[i-k];
        for(int i=0; i<k; i++)
            nums[i] = arr[i];
        */
        reverse(nums, 0, l-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, l-1);

    }

    private void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/