package randomAlgs.Trees;


import java.util.Arrays;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

public class MaxDepthNAryTree {
    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }

        int maxDepth = 0;

        // Recursive DFS to calculate the maximum depth
        for (Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }

        return 1 + maxDepth;
    }

    public static void main(String[] args) {

        Node root1 = new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6))), new Node(2), new Node(4)
        ));
        MaxDepthNAryTree solution = new MaxDepthNAryTree();
        System.out.println(solution.maxDepth(root1));


        Node root2 = new Node(1, Arrays.asList(new Node(2), new Node(3, Arrays.asList(new Node(6), new Node(7, Arrays.asList(new Node(11, Arrays.asList(new Node(14)))
                        ))
                )),
                new Node(4, Arrays.asList(new Node(8, Arrays.asList(
                        new Node(12)
                )))),
                new Node(5, Arrays.asList(
                        new Node(9, Arrays.asList(new Node(13))),
                        new Node(10)
                ))
        ));
        System.out.println(solution.maxDepth(root2));
    }
}
