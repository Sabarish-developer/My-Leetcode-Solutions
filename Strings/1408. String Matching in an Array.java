class Solution {
    public List<String> stringMatching(String[] words) {
        
        Set<String> set = new HashSet<> ();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i!=j && words[i].contains(words[j]) )
                    set.add(words[j]);
            }
        }
        return new ArrayList<String> (set);
    }
}
/*
Time complexity - O(n^2)
Space complexity - O(n)
*/