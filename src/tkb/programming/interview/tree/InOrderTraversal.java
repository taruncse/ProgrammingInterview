package tkb.programming.interview.tree;

import java.util.Scanner;

public class InOrderTraversal {
   public static void inorderTraversal(Node root){
        if (root == null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data +" ");
        inorderTraversal(root.right);
    }
}
//Test data

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node root = null;
        while (n-- > 0) {
            int data = scan.nextInt();
            root = insertNode(root, data);
        }

        InOrderTraversal.inorderTraversal(root);
    }

    private static Node insertNode(Node root , int data) {
        if (root == null){
            return new Node(data);
        }else {
            Node current;
            if (root.data >= data){
                current = insertNode(root.left,data);
                root.left = current;
            }else {
                current =  insertNode(root.right,data);
                root.right = current;
            }
            return root;
        }
    }*/