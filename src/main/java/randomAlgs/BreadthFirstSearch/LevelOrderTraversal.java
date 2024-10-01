package randomAlgs.BreadthFirstSearch;

import java.util.*;

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {

    public static String traversal(TreeNode<Integer> root) {
        if (root == null) {
            return "None";
        }

        Queue<TreeNode<Integer>> currentQueue = new LinkedList<>();
        Queue<TreeNode<Integer>> nextQueue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        currentQueue.offer(root);
        while (!currentQueue.isEmpty()) {
            List<String> currentLevel = new ArrayList<>();

            while (!currentQueue.isEmpty()) {
                TreeNode<Integer> node = currentQueue.poll();
                currentLevel.add(String.valueOf(node.data));

                if (node.left != null) {
                    nextQueue.offer(node.left);
                }
                if (node.right != null) {
                    nextQueue.offer(node.right);
                }

            }

            result.append(String.join(", ", currentLevel));
            if (!nextQueue.isEmpty()) {
                result.append(" : ");
            }
            currentQueue = nextQueue;
            nextQueue = new LinkedList<>();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(30);
        root.left = new TreeNode<>(10);
        root.right = new TreeNode<>(40);
        root.left.left = new TreeNode<>(8);
        root.right.left = new TreeNode<>(9);
        root.right.right = new TreeNode<>(50);

        String result = traversal(root);
        System.out.println(result);
    }
}
