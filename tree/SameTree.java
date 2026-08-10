// Problem Statement : Given the roots of two binary trees p and q, return true if the trees are equivalent, otherwise return false.
// Two binary trees are considered equivalent if they share the exact same structure and the nodes have the same values.

package tree;

public class SameTree {
    
    // Depth First Search Approach..........
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        SameTree tree = new SameTree();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("Depth First Search Approach : " + tree.isSameTree(root1,root2));
    }

}
