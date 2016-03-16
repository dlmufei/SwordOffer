/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *例如:输入前序遍历序列{1,2,4,7,3,5,6,8}
 *中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author FEI
 *
 */
public class ReConstructBinaryTree_Class {

	/**
	 * 创建树节点类
	 * 
	 * @author FEI
	 * 
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	/**
	 * 
	 * @param pre前序遍历数组
	 * @param in中序遍历数组
	 * @return
	 */
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private static TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
         
        if(startPre>endPre||startIn>endIn)
            return null;
        //根节点是前序遍历数组的起始元素
        TreeNode root=new TreeNode(pre[startPre]);
         //判断根节点的左右节点
        //从前序数组进行分割，前序数组的首节点，是中序数组的左右子树的分割节点
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
            	//左子树的根节点
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
                 
        return root;
    }
    
    
    public static void main(String[] args) {
		System.out.println("123");
	}
	
	
	

}
