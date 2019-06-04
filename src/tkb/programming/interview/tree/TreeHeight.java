package tkb.programming.interview.tree;

import java.util.Scanner;

public class TreeHeight {

    // Test data
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }*/

    public static int height(Node root) {
        // Write your code here.
        if (root == null) {
            return -1;
        } else {
            return 1+Math.max(height(root.left), height(root.right));
        }
    }

   public static Node insert(Node root, int data){
       if (root == null){
           return new Node(data);
       }else {
           Node current;
           if (root.data >= data){
               current = insert(root.left,data);
               root.left = current;
           }else {
               current =  insert(root.right,data);
               root.right = current;
           }
           return current;
       }
   }
}


