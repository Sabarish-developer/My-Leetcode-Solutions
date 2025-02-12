class Solution {
    public int[] assignElements(int[] groups, int[] elements) {

        int[] assigned = new int[groups.length];
        //Pre-processing each element and its index
        Map<Integer, Integer> map = new HashMap<> ();
        for(int i=0; i<elements.length; i++){
            map.putIfAbsent(elements[i], i);
        }
        
        int min;
        for(int x=0; x<groups.length; x++){
            int n = groups[x];
            min = Integer.MAX_VALUE;
            //Finding all factors of n
            for(int i=1; i*i<=n; i++){
                if(n%i == 0){
                    //If the divisor is in hashmap
                    int index = map.getOrDefault(i, Integer.MAX_VALUE);
                    min = index<min ? index : min;
                    if(i!=(n/i)){
                        index = map.getOrDefault((n/i), Integer.MAX_VALUE);
                        min = index<min ? index : min;
                    }
                }
            }
            assigned[x] = min==Integer.MAX_VALUE ? -1 : min;
        }
        return assigned;
    }
}
/*
Time complexity - O(n(n ^ 1/2) + m)
    where m-size of elements, n - size of groups 
Space complexity - O(m)
*/