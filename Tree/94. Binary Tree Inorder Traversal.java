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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // Morris Inorder Traversal

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
                    predecessor.right = current;
                    current = current.left;
                }
                else{
                    predecessor.right = null;
                    nodes.add(current.val);
                    current = current.right;
                }
            }
        }
        return nodes;
    }
}

/*
Approach 1 : Recursive 
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorder(root,nodes);
        return nodes;
    }
    private void inorder(TreeNode root, List<Integer> nodes){
        if(root == null) return;
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }
}
Time complexity - O(n)
Space complexity - O(n) for values + O(n) O(h) O(log n)

Approach 2 : Morris traversal
Time complexity - O(n)
Space complxity - O(1) Ignoring the space used to store values
*/