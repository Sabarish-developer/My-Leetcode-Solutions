class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        /*
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String str1 = new String(c1);
        String str2 = new String(c2);
        return str1.equals(str2);
        */
        int[] s_count = new int[26];
        int[] t_count = new int[26];
        for(char c: s.toCharArray())
            s_count[c - 'a']++;
        for(char c: t.toCharArray())
            t_count[c- 'a']++;
        for(int i=0; i<26; i++){
            if(s_count[i] != t_count[i])
                return false;
        }
        return true;

    }
}
/*
Time complexity - O(n+m)
Space complexity - O(1)

Refer 383. Ranson Note for follow up question
*/