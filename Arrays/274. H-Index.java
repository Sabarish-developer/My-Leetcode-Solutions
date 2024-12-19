class Solution {
    public int hIndex(int[] citations) {
        

        //Intuition
        /*
        int l = citations.length;
        Arrays.sort(citations);
        while(l > 0){
            if(citations[citations.length-l] >= l)
                return l;
            l--;
        }
        return l;
        */

        //Optimized Approach - Count sort O(n)
        int n = citations.length;
        int[] count = new int[n+1]; // Size n+1 to store count of elements >= n in count[n]
        for(int i: citations){ 
            if(i >= n)
                count[n]++;
            else
                count[i]++;
        }

        int total = 0;
        for(int i=n; i>0; i--){ // i ranges from total_papers(n) to 0 paper
            total += count[i]; // Adding to know total no. of citations greater than i
            if(total >= i)
                return i; //If total citations >= i then it is h-index
        }
        return 0;
    }
}
/*
Approach 1 :
    Time complexity - O(nlogn)
    Space complexity - O(1)

Approach 2 : Count sort
    Time complexity - O(n)
    Space complexity - O(n)

*/