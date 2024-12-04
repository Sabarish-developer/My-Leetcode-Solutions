class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<> ();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(map.containsKey(sorted))
                map.get(sorted).add(s);
            else{
                map.put(sorted, new ArrayList<> ());
                map.get(sorted).add(s);
            }
        }

        //Adding all key values to a resultant list
        return new ArrayList<> (map.values());

    }
}
/*
Time complexity - O(n * k log k) Sorting each string takes k logk
Space complexity - O(n * k)
    where k - average length of strings

Note : 
    -> Use sorted string value as key for hashmap
    -> If you want to optimize, use some other key value to reduce klogk but careful in handling collisions.

*/