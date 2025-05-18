/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {

        /*
         * Approach 1 : Get left and right height for each node
         * 
         * if(root == null) return true;
         * 
         * Queue<TreeNode> queue = new LinkedList<>();
         * queue.offer(root);
         * while(!queue.isEmpty()){
         * int levelSize = queue.size();
         * for(int i=0; i<levelSize; i++){
         * TreeNode currentNode = queue.poll();
         * if(currentNode.left != null)
         * queue.offer(currentNode.left);
         * if(currentNode.right != null)
         * queue.offer(currentNode.right);
         * int leftHeight = height(currentNode.left);
         * int rightHeight = height(currentNode.right);
         * if(Math.abs(leftHeight-rightHeight) > 1)
         * return false;
         * }
         * }
         * return true;
         */

        // Approach 2 : Modify the findHeight function

        if (root == null)
            return true;
        int height = height(root);
        return height == -1 ? false : true;
    }

    public int height(TreeNode root) {

        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Checking each node
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // To return the -1 value from child nodes
        if (leftHeight == -1 || rightHeight == -1)
            return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
/*
 * Approach 1 :
 * Time complexity - O(n^2)
 * Space complexity - O(n)
 * 
 * Approach 2 :
 * Time complexity - O(n)
 * Space complexity - O(n)
 */