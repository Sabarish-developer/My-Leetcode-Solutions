class Solution {
    public String countAndSay(int n) {
        
        if(n == 1)
            return "1";
        String s = "1";
        for(int i=2; i<=n; i++){
            s = countAndSayHelper(s);
            System.out.println(s);
        }
        return s;
    }

    private String countAndSayHelper(String s){
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(int i=0; i<s.length(); i++){
            count = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            str.append(count);
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
/*
Time complexity - O(2 ^n)
Space complexity - O(n)
*/