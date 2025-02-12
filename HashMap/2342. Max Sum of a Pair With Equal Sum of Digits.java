class Solution {
    public int maximumSum(int[] nums) {

        /*
        Map<Integer, List<Integer>> map = new HashMap<> ();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int sum = addDigits(nums[i]);
            if(map.containsKey(sum))
                map.get(sum).add(i);
            else{
                map.put(sum, new ArrayList<>());
                map.get(sum).add(i);
            }
        }
        int max = -1;
        for(int sum: map.keySet()){
            int size = map.get(sum).size();
            if(size > 1){
                for(int i=0; i<size-1; i++){
                    int total = nums[map.get(sum).get(i)] + nums[map.get(sum).get(i+1)];
                    max = total>max ? total : max;
                }
            }
        }
        return max;
        */
        int max = -1;
        int[] digits = new int[82];
        Arrays.fill(digits,-1);
        for(int i=0; i<nums.length; i++){
            int sum = addDigits(nums[i]);
            if(digits[sum] != -1){
                max = (nums[i]+digits[sum])>max ? nums[i]+digits[sum] : max;
            }
            digits[sum] = nums[i]>digits[sum] ? nums[i] : digits[sum];
        }
        return max;
    }

    private static int addDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}
/*
Time complexity - O(n) actually (n log m) since logm ~ 9 due to constraint.
Space complexity - O(1)
*/