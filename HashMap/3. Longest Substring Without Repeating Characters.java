class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        Map<Character, Integer> map = new HashMap<> ();
        int left = 0;
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            if(map.getOrDefault(c, -1) >= left){
                left = map.get(c) + 1;
            }
            map.put(c, right);
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/