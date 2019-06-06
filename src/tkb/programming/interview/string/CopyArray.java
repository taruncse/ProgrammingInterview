package tkb.programming.interview.string;

/**
 * public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length)
 * src - Source array (Object type)
 *
 * srcPos - Starting position in Source array (Integer type)
 *
 * dest - Destination array (Object Type)
 *
 * destpos - Starting position in destination array (Integer type)
 *
 * length - Number of elements to be copied (Integer type)
 *
 * Problem : Arrays: Left Rotation (HackerRank)
 */
public class CopyArray {
    // Test data
   /* public static void main(String[] args) {

        int arr1[] = { 0, 1, 2, 3, 4, 5 };

        int[] result = rotLeft(arr1, 2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }*/
    static int[] rotLeft(int[] a, int d) {

        int length = a.length;
        int[] b = new int[length];
        int diff = length -d ;
        System.arraycopy(a, d, b, 0, diff);
        System.arraycopy(a, 0, b, diff, d);
        return b;
    }
}
