package tkb.programming.interview;

import tkb.programming.interview.tree.BinarySearchTreeTest;
import tkb.programming.interview.tree.InOrderTraversal;
import tkb.programming.interview.tree.Node;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node root = null;
        while (n-- > 0) {
            int data = scan.nextInt();
            root = insertNode(root, data);
        }

       boolean test =  BinarySearchTreeTest.checkBST(root);
        System.out.print(test);
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
    }
}
