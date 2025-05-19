/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        getHeight(root);
        return diameter;
    }

    private int getHeight(TreeNode root){
        if(root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(leftHeight+rightHeight > diameter){
            diameter = leftHeight + rightHeight;
        }
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
/*
Time complexity - O(n)
Space complexity - O(n) O(h) O(log n)

Another approach without class variable : 
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    private int height(TreeNode root, int[] diameter){
        if(root == null) return 0;
        int left = height(root.left,diameter);
        int right = height(root.right,diameter);
        diameter[0] = Math.max(diameter[0], left+right);
        return 1+Math.max(left,right);
    }
}

Note : 
    Here, diameter[] is used insted of diameter because in java
    -> primitives - pass by value, change inside doesn't reflect outside
    -> objects - pass by reference, change inside is reflected outside
Complexities are same as other approach
*/