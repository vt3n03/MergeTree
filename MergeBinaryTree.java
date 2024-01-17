/**
 * The MergeBinaryTree class contains a method to merge two binary trees.
 * Given two binary trees 't1' and 't2', the method merges them into a single binary tree 'merged',
 * where each node in the 'merged' tree contains the sum of corresponding nodes in 't1' and 't2'.
 */
class MergeBinaryTree
{

    /**
     * Merges two binary trees into a single binary tree.
     * Each node in the merged tree contains the sum of the corresponding nodes in the input trees.
     *
     * @param t1 The root node of the first binary tree to be merged.
     * @param t2 The root node of the second binary tree to be merged.
     * @return The root node of the merged binary tree.
     */
    public TreeNode merge(TreeNode t1, TreeNode t2)
    {
        // If both trees are empty, return null, as there is nothing to merge.
        if (t1 == null && t2 == null) return null;

        // If either of the trees is empty, return the non-empty tree as the merged tree.
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        // Create a new TreeNode in the merged tree with the sum of values from the input trees.
        TreeNode merged = new TreeNode(t1.val + t2.val);

        // Recursively merge the left subtrees of t1 and t2 and assign the result to the left child of the merged node.
        merged.left = merge(t1.left, t2.left);

        // Recursively merge the right subtrees of t1 and t2 and assign the result to the right child of the merged node.
        merged.right = merge(t1.right, t2.right);

        return merged; // Return the root of the merged binary tree.
    }
}
