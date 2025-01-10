class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<> ();
        String[] directories = path.split("/");
        for(String dir : directories){
            if(dir.equals(".") || dir.isEmpty())
                continue;
            else if(dir.equals("..")){
                if(stack.size()>0)
                    stack.pop();
            }
            else
                stack.push(dir);
        }
        StringBuilder str = new StringBuilder();
        for(String s: stack){
            str.append("/").append(s);
        }
        return str.length()>0 ? str.toString() : "/";
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/