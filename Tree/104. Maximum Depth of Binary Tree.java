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
    public int maxDepth(TreeNode root) {
        
        /* Approach 1 : Using recursion

        if(root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight,rightHeight);
        */

        // Approach 2 : Level Order traversal

        Queue<TreeNode> queue = new LinkedList<> ();
        if(root == null) return 0;
        int height = 0;
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null)
                    queue.offer(currentNode.left);
                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            height++;
        }
        return height;
    }
}
/*
Approach 1 : 
    Time complexity - O(n)
    Space complexity : 
        -> Best case - O(log n) when tree is complete
        -> Avg case  - O(h) where h is height of tree
        -> Worst case - O(n) when tree is skew/linear

Approach 2 : 
    Time complexity - O(n)
    Space complexity - O(n)

Note : 
    -> The error i made here is using "i<queue.size()" in for loop condition.
    -> This should be avoided since queue is changing at each iteration.
*/