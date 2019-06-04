package tkb.programming.interview.tree;

public class BinarySearchTreeTest {
    public static boolean  checkBST(Node root) {
        return checkBST(root, null, null);
    }

    public static boolean checkBST(Node root, Integer min, Integer max){
        if(root == null) {
            return true;
        }
        if ((min != null && root.data <= min) || (max != null && root.data > max)){
            return false;
        }

        if (!checkBST(root.left, min , root.data) || !checkBST(root.right, root.data , max) ){
            return false;
        }

        return true;
    }
}
