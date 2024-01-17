class BST
{

    TreeNode root; // Adding the root variable to keep track of the root node of the BST.

    /**
     * Inserts a new integer value into the BST.
     * If the BST is empty, the new value becomes the root node.
     *
     * @param val The integer value to be inserted into the BST.
     */
    public void insert(int val)
    {
        root = insertRecursive(root, val);
    }

    /**
     * Private helper method to recursively insert a new integer value into the BST.
     *
     * @param node The current node being examined during the insertion process.
     * @param val The integer value to be inserted into the BST.
     * @return The updated node after insertion.
     */
    private TreeNode insertRecursive(TreeNode node, int val)
    {
        if (node == null)
        {
            // If the current node is null (empty subtree), create a new TreeNode with the given value.
            return new TreeNode(val);
        }

        if (val < node.val)
        {
            // If the value to be inserted is less than the current node's value, insert it into the left subtree.
            node.left = insertRecursive(node.left, val);
        } else if (val > node.val)
        {
            // If the value to be inserted is greater than the current node's value, insert it into the right subtree.
            node.right = insertRecursive(node.right, val);
        }

        return node;
    }

    /**
     * Inserts a new integer value into the BST.
     * This method allows inserting a value into a specific subtree rooted at the given 'root' node.
     *
     * @param root The root of the subtree where the value will be inserted.
     * @param val The integer value to be inserted into the BST.
     * @return The updated 'root' node of the subtree after insertion.
     */
    public TreeNode insert(TreeNode root, int val)
    {
        if (root == null)
            // If the current node is null (empty subtree), create a new TreeNode with the given value.
            return new TreeNode(val);

        if (val < root.val)
            // If the value to be inserted is less than the current node's value, insert it into the left subtree.
            root.left = insert(root.left, val);
        else if (val > root.val)
            // If the value to be inserted is greater than the current node's value, insert it into the right subtree.
            root.right = insert(root.right, val);

        return root;
    }

    /**
     * Performs an inorder traversal of the BST and prints the values of the nodes in ascending order.
     *
     * @param root The root of the subtree from where the inorder traversal starts.
     */
    public void inorderTraversal(TreeNode root)
    {
        if (root != null)
        {
            // Recursively traverse the left subtree.
            inorderTraversal(root.left);
            // Print the current node's value.
            System.out.print(root.val + " ");
            // Recursively traverse the right subtree.
            inorderTraversal(root.right);
        }
    }
}
