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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<> ();
        postorder(root,nodes);
        return nodes;
    }
    private void postorder(TreeNode root,List<Integer> nodes){
        if(root == null) return;
        postorder(root.left,nodes);
        postorder(root.right,nodes);
        nodes.add(root.val);
    }
}
/*
Time complexity - O(n)
Space complexity - O(n) + O(n) O(h) O(log n)
*/