class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(sum == target)
                return new int[] {++left,++right};
            else if(sum < target)
                left++;
            else
                right--;
        }
        return null;
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)

How to return an array without initializing?
    -> return new int[] {element1,element2};
    
*/