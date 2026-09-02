// Problem Statement : You are given the root of a binary tree, return the inorder traversal of its nodes' values.


package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    // Using Recursion Approach..........
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

    // Depth First Search Approach.......
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
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

        System.out.println("Recursion Approach : " + new InOrderTraversal().inorderTraversal(root));
        System.out.println("Depth First Search : " + new InOrderTraversal().inorderTraversal1(root));
    }

}
