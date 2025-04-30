import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        this.data = value;
        left = null;
        right = null;
    }
}

public class FindingView_BinaryTree_BFS {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("LeftView:");
        leftView(root);
        System.out.println();
        System.out.println("RightView:");
        rightView(root);
    }

    public static void leftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size(); 

            for (int i = 0; i < levelSize; i++) {

                Node temp = q.poll();

                if (i == 0) {
                    System.out.println(temp.data);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void rightView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node temp = q.poll();

                // Last node at this level is part of the right view
                if (i == levelSize - 1) {
                    System.out.println(temp.data);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

}
