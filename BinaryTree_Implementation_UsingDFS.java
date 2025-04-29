// Implementation using Depth first search (DFS)

// node class 
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

// creating public class for binary tree 
public class BinaryTree_Implementation_UsingDFS {

    // main class 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
     }

     // method for Inorder - LNR 
     public static void inorder(Node root){
        //base case 
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data +" ");
        inorder(root.right);
     }

    // method for PreOrder - NLR
    public static void preorder(Node root){
        //base case 
        if(root == null){
            return ;
        }
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
     }

     // method for PostOrder - LRN 
     public static void postorder(Node root){
        //base case 
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data +" ");
     }
}