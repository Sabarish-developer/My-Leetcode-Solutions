class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        
        if(words.length < 2)
            return 0;
        int count = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if(isPrefixSuffix(words[i],words[j]))
                    count++;
            }
        }
        return count;
    }

    private boolean isPrefixSuffix(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();

        if(l1 > l2)
            return false;

        boolean prefix = true;
        for(int i=0; i<l1; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                prefix = false;
                break;
            }
        }
        boolean suffix = true;
        int index = l2-l1;
        int k=0;
        for(int i=index; i<l2; i++){
            if(str1.charAt(k++) != str2.charAt(i)){
                suffix = false;
                break;
            }
        }
        return prefix && suffix;

    }
}
/*
Time complexity - O(n^2)
Space complexity - O(1)
*/