class Solution {
    public String findValidPair(String s) {

        int freq[] = new int[10];
        for(int i=0; i<s.length(); i++){
            int k = s.charAt(i) - '0';
            freq[k]++;
        }
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                int k1 = s.charAt(i-1) - '0';
                int k2 = s.charAt(i) - '0';
                if(k1==freq[k1] && k2==freq[k2]){
                    return s.substring(i-1,i+1);
                }
            }
        }
        return "";
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/