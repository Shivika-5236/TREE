// importing LinkedList and Queue 
import java.util.LinkedList;
import java.util.Queue;

// creating class node
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

// public class for binary tree implementation
public class BinaryTree_Implementation_UsingBFS {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("BFS (Left to Right):");
        printBFS_LeftToRight(root);

        System.out.println();

        System.out.println("BFS (Right to Left):");
        printBFS_RightToLeft(root);
    }

    // left to right 
    public static void printBFS_LeftToRight(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    //right to left 
    public static void printBFS_RightToLeft(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data + " ");
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
        }
    }
}
