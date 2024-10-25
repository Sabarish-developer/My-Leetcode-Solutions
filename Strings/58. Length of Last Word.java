class Solution {
    public int lengthOfLastWord(String s) {

        String[] array = s.split(" ");
        int length = array[(array.length)-1].length();
        return length;
    }
}

/*
Time complexity - O(n)
Space complexity - O(n)

*/