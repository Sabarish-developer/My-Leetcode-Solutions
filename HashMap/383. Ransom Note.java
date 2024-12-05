class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length())
            return false;
        
        //Approach 1 : HashMap
        /*
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c: ransomNote.toCharArray()){
            if(map.getOrDefault(c, 0) < 1)
                return false;
            map.put(c, map.get(c)-1);
        }
        return true;
        */

        //Approach 2 : Arrays
        int[] arr = new int[26];
        for(char c: magazine.toCharArray())
            arr[c - 'a']++;
        for(char c: ransomNote.toCharArray()){
            if(arr[c - 'a'] < 1)
                return false;
            arr[c - 'a']--;
        }
        return true;
    }
}
/*
Logic : 
    -> Store all unique characters with frequency like c : 2 in magazine
    -> Now iterate all char in ransomNote , if the char is not present or frequency=0 return false
    -> Or else decrease the frequency of that c

Approach 1 : Hashmap
    Time complexity - O(m+n)
    Space complexity - O(k) k-keys

Approach 2 : Arrays
    Time complexity - O(m+n)
    Space complexity - O(1)

Note : 
    -> In terms of complexity both are same, if the constraint is only lowercase array is faster.
    -> If more characters including Uppercase and special then HashMap is better.
*/