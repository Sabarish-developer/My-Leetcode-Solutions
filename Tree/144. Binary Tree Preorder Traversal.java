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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        //Morris Traversal

        List<Integer> nodes = new ArrayList<> ();
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                nodes.add(current.val);
                current = current.right;
            }
            else{
                TreeNode predecessor = current.left;
                while(predecessor.right!=null && predecessor.right!=current){
                    predecessor = predecessor.right;
                }
                if(predecessor.right == null){
                    nodes.add(current.val);
                    predecessor.right = current;
                    current = current.left;
                }
                else{
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
        return nodes;
    }
}
/*
class Solution {
    List<Integer> nodes = new ArrayList<> ();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null)
            return nodes;
        
        nodes.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return nodes;
    }
}
Time complexity - O(n)
Space complexity - O(n) + O(n) O(h) O(log n)

Note : 
    -> Morris traversal have O(1) space complexity
*/