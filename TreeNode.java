/**
 * The TreeNode class represents a single node in a binary tree.
 * Each node contains an integer value ('val') and references to its left and right children.
 */
class TreeNode
{

    int val; // The integer value stored in the node.
    TreeNode left; // Reference to the left child node.
    TreeNode right; // Reference to the right child node.

    /**
     * Constructor to create a new TreeNode with the given integer value.
     *
     * @param val The integer value to be stored in the TreeNode.
     */
    public TreeNode(int val)
    {
        this.val = val; // Set the 'val' field to the given value.
        this.left = null; // Initialize 'left' reference to null, as there is no left child initially.
        this.right = null; // Initialize 'right' reference to null, as there is no right child initially.
    }
}
