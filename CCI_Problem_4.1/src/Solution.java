
public class Solution {
	
	/**
	 * This function checks the maximum depth of the binary tree
	 */
	public int maxDepth(BTNode node) {
		if(node == null) {return 0;}
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
	}
	
	/**
	 * This function checks the minimum depth of the binary tree
	 */
	public int minDepth(BTNode node) {
		if(node == null) {return 0;}
		return 1 + Math.min(minDepth(node.left), minDepth(node.right));
	}
	
	/**
	 * Checking the balance of the tree
	 */
	public boolean checkingBalance(BTNode node) {
		return maxDepth(node)-minDepth(node)<=1;
	}
}


/**
References:
	https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
	http://www.growingwiththeweb.com/2015/11/check-if-a-binary-tree-is-balanced.html
**/