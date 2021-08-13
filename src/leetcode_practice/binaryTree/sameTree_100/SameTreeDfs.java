package leetcode_practice.binaryTree.sameTree_100;

/**
 * Accepted solution
 * DFS
 * 0ms
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class SameTreeDfs {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		//one of them is null
		if (p == null || q == null) {
			return false;
		}

		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(9);
		TreeNode node2x = new TreeNode(10);
		TreeNode node2y = new TreeNode(15);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(2);
		node1.left = node2;
		node1.right = node3;
		node2.left = node2x;
		node2.right = node2y;
		node3.left = node4;
		node3.right = node5;

		TreeNode node11 = new TreeNode(5);
		TreeNode node22 = new TreeNode(9);
		TreeNode node22x = new TreeNode(10);
		TreeNode node22y = new TreeNode(15);
		TreeNode node33 = new TreeNode(3);
		TreeNode node44 = new TreeNode(5);
		TreeNode node55 = new TreeNode(2);
		node11.left = node22;
		node11.right = node33;
		node22.left = node22x;
		node22.right = node22y;
		node33.left = node44;
		node33.right = node55;

		System.out.println("Same tree " + new SameTreeDfs().isSameTree(node1, node11));
	}
}