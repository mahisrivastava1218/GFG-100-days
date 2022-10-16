class Solution {
    ArrayList<Integer> lst=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null) return lst;
        inorderTraversal(root.left);
        lst.add(root.val);
        inorderTraversal(root.right);
        
        
        return lst;
    }
}
