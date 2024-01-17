import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of the MergeBinaryTree class to merge two binary trees.
        MergeBinaryTree merger = new MergeBinaryTree();

        // Print a message indicating the start of the process.
        System.out.println("Resultant Binary Search Tree:");

        // Define two binary trees (t1 and t2) to be merged
        TreeNode t1 = new TreeNode(23);
        t1.left = new TreeNode(17);
        t1.left.left = new TreeNode(9);
        t1.right = new TreeNode(39);
        t1.right.right = new TreeNode(78);
        t1.right.right.left = new TreeNode(61);

        TreeNode t2 = new TreeNode(18);
        t2.left = new TreeNode(15);
        t2.left.right = new TreeNode(16);
        t2.left.right.left = new TreeNode(19);
        t2.right = new TreeNode(20);
        t2.right.right = new TreeNode(25);

        // Merge the two binary trees (t1 and t2) using the 'MergeBinaryTree' class and store the result in 'mergedTree'.
        TreeNode mergedTree = merger.merge(t1, t2);

        // Create instances of BST, AVL, and Rotation classes to convert the merged binary tree into a Binary Search Tree (BST) using AVL rotations.
        BST bst = new BST();
        AVL avl = new AVL();
        Rotation rotation = new Rotation();

        // Perform a level order traversal of the merged tree and print it horizontally with proper spacing.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(mergedTree); // Enqueue the root of the merged tree.

        int maxWidth = 8; // Adjust this value to control the spacing between nodes horizontally.
        int levelWidth = 1;

        while (!queue.isEmpty())
        {
            int levelSize = queue.size();
            int padding = (maxWidth - levelWidth) / 2; // Calculate the padding needed to center nodes horizontally at this level.

            for (int i = 0; i < levelSize; i++)
            {
                TreeNode node = queue.poll(); // Dequeue the node from the front of the queue.

                if (node != null)
                {
                    for (int j = 0; j < padding; j++)
                    {
                        System.out.print(" "); // Print space for spacing between nodes at this level.
                    }

                    System.out.print(node.val + " "); // Print the value of the current node.

                    queue.add(node.left); // Enqueue the left child for the next level traversal.
                    queue.add(node.right); // Enqueue the right child for the next level traversal.
                }
            }
            System.out.println(); // Move to the next level for the next iteration
        }
    }
}