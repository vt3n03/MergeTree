class AVL
{

    /**
     * Calculates the balance factor of a given tree node.
     * The balance factor is defined as the difference between the height of the left subtree and the height of the right subtree.
     * It determines whether a tree node requires rebalancing.
     *
     * @param node The TreeNode whose balance factor needs to be calculated.
     * @return The balance factor of the given node: balance = height(left subtree) - height(right subtree).
     *         If the node is null, it returns 0, indicating a balanced subtree.
     */
    public int getBalance(TreeNode node)
    {
        if (node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    /**
     * Calculates the height of a given tree node.
     * The height of a node is defined as the length of the longest path from the node to a leaf node in its subtree.
     *
     * @param node The TreeNode whose height needs to be calculated.
     * @return The height of the given node: the maximum height between its left and right subtrees, plus one to include the node itself.
     *         If the node is null, it returns -1, representing an empty subtree's height.
     */
    public int getHeight(TreeNode node)
    {
        if (node == null) return -1;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    /**
     * Calculates the balance factor of a given tree node similar to getBalance() method.
     * This method may have been created for convenience or specific use cases.
     *
     * @param node The TreeNode whose balance factor needs to be calculated.
     * @return The balance factor of the given node: balance = height(left subtree) - height(right subtree).
     *         If the node is null, it returns 0, indicating a balanced subtree.
     */
    public int checkBalance(TreeNode node)
    {
        if (node == null) return 0;
        return getHeight(node.left) - getHeight(node.right);
    }
}
