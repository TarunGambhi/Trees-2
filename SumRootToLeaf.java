//Tc: o(n)
//sc: o(h) recursive stack space [height of tree]
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
class Solution {
    int result;
    public int sumNumbers(TreeNode root) {
        int sum =0;
        dfs(root,sum);
        return result;
    }
    private void dfs(TreeNode root, int sum){
        //base
        if(root == null) return;
        //logic
        sum = sum*10 + root.val;
        if(root.left == null && root.right ==null){
            result = result+sum;
        }else{
            dfs(root.left,sum);
            dfs(root.right,sum);
        }
    }
}
