/**
 * The Rotation class provides methods to perform single and double rotations on a binary tree to maintain its balance.
 * Rotations are essential in AVL (Adelson-Velsky and Landis) trees to restore the balanced property after insertions or deletions.
 */
class Rotation
{

    /**
     * Performs a single rotation on the given binary tree node.
     * Depending on the 'isLeftChild' flag, it rotates the node to the left or right.
     *
     * @param root The root node of the binary tree where rotation is to be performed.
     * @param isLeftChild A boolean flag indicating whether the rotation is to be performed on the left child (true) or right child (false).
     * @return The new root node of the subtree after the single rotation.
     */
    public TreeNode singleRotation(TreeNode root, boolean isLeftChild)
    {
        TreeNode newRoot;
        if (isLeftChild)
        {
            // Perform a left rotation.
            newRoot = root.left;
            root.left = newRoot.right;
            newRoot.right = root;
        } else
        {
            // Perform a right rotation.
            newRoot = root.right;
            root.right = newRoot.left;
            newRoot.left = root;
        }
        return newRoot; // Return the new root of the rotated subtree.
    }

    /**
     * Performs a double rotation on the given binary tree node.
     * Depending on the 'isLeftChild' flag, it performs a left-right or right-left double rotation.
     *
     * @param root The root node of the binary tree where double rotation is to be performed.
     * @param isLeftChild A boolean flag indicating whether the double rotation is to be performed on the left child (true) or right child (false).
     * @return The new root node of the subtree after the double rotation.
     */
    public TreeNode doubleRotation(TreeNode root, boolean isLeftChild)
    {
        if (isLeftChild)
        {
            // Perform a left-right double rotation.
            root.left = singleRotation(root.left, false);
            return singleRotation(root, true);
        } else
        {
            // Perform a right-left double rotation.
            root.right = singleRotation(root.right, true);
            return singleRotation(root, false);
        }
    }
}
