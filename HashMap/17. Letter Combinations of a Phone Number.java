class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty())
            return new ArrayList<String> ();

        List<String> combinations = new ArrayList<> ();
        char[] tempLetters = new char[digits.length()];
        letterCombinationsHelper(digits, 0, tempLetters, combinations);
        return combinations;
    }

    private static String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private List<String> letterCombinationsHelper(String digits, int digit, char[] tempLetters, List<String> combinations){
        if(digit >= digits.length()){
            combinations.add(new String(tempLetters));
            return combinations;
        }
        else{
            for(int i=0; i<map[digits.charAt(digit) - '0'].length(); i++){
                char c = map[digits.charAt(digit) - '0'].charAt(i);
                tempLetters[digit] = c;
                letterCombinationsHelper(digits, digit+1, tempLetters, combinations);
            }
        }
        return combinations;
    }
}
/*
Time complexity - O(4 ^ n)
Space complexity - O(n)
*/