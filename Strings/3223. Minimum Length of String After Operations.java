class Solution {
    public int minimumLength(String s) {
        
        int l = s.length();
        if(l < 3)
            return l;
        
        /*
        Map<Character, Integer> map = new HashMap<> ();
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c , map.get(c)+1);
            else
                map.put(c,1);
        }
        for(char c: map.keySet()){
            int freq = map.get(c);
            while(freq >= 3){
                freq -= 2;
                l -= 2;
            }
        }
        return l;
        */
        int[] freq = new int[26];
        for(int i=0; i<l; i++)
            freq[s.charAt(i)-'a']++;
        for(int i=0; i<26; i++){
            if(freq[i] >= 3){
                while(freq[i] >= 3){
                    freq[i] -= 2;
                    l -= 2;
                }
            }
        }
        return l;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/