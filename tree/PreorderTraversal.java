package tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    private List<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        preorder(root);
        return res;
    }

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preorder(node.left);
        preorder(node.right);
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

        System.out.println(new PreorderTraversal().preorderTraversal(root));
    }
}
