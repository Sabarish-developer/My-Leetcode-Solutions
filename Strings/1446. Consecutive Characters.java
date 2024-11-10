class Solution {
    public int maxPower(String s) {
        
        int count = 1;
        int power = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))
                count++;
            else
                count = 1;
            
            if(count > power)
                power = count;
        }
        return power;

    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/