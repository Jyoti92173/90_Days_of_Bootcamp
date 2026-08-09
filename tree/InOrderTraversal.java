package tree;

import java.util.ArrayList;
import java.util.List;



public class InOrderTraversal {
    // Using Recursion Approach.........
    private List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        inorder(root);
        return res;
    }
 // InOrder Traversal Method....
    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        res.add(node.val);
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        System.out.println(new InOrderTraversal().inorderTraversal(root));
    }

}
