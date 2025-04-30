/*
 * Method : 
 * Size 
 * Count
 * Sum
 * Height
 * Maximum value
 * Find value
 */

// creating node class
class Node{
    int data ;
    Node left ;
    Node right ;
    
    Node (int value){
        this.data = value;
        left = null;
        right = null;
    }
}

public class Diff_Method_on_Binary_Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // to find the length of the binary tree
        int ans = return_Size(root);
        System.out.println(ans);

        // to find the no. of nodes
        System.out.println(countNodes(root));

        //to find the sum of binary tree
        System.out.println(sumofBinaryTree(root));

        // to find the height of binary tree
        System.out.println(height(root));

        // to find the maximum value in binary tree
        System.out.println(maxValue(root));

        // to find a given value in binary tree
        System.out.println(search(root, ans));
    }

    // method to find the length 
    public static int return_Size(Node root) {
        //base case 
        if(root == null){
            return 0;
        }
        int left = return_Size(root.left);
        int right = return_Size(root.right);
        return left+right+1;
    }

    // method to count the nodes
    public static int countNodes(Node root) {
        //base case 
        if(root == null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }

    // method to find the sum of binary tree
    public static int sumofBinaryTree(Node root){
     //base case 
     if(root == null){
        return 0;
     }
     return sumofBinaryTree(root.left) + sumofBinaryTree(root.right) + root.data;

    }
 
    // method to find the height of binary tree
    public static int height(Node root){
    //base case 
    if(root == null){
        return 0;

    }
    int left = height(root.left);
    int right = height(root.right);
    return Math.max(left, right)+1;
    }

    // method to find the  maximum value 
    public static int maxValue(Node root){
    //base case 
    if(root == null){
        return Integer.MIN_VALUE;

    } 
    int rightMax = maxValue(root.right);
    int leftMax = maxValue(root.left);
    return Math.max(rightMax,Math.max(leftMax,root.data));
    }

    //method to find a given value in binary tree
    public static boolean search(Node root , int key){
        // base case 
        if (root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        boolean left = search(root.left, key);
        if(left == true){
            return true;
        }
        boolean right = search(root.right, key);
        if(right==true){
            return true;
        }
    return false;   
    }

    
}

