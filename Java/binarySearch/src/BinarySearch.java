import java.util.Arrays;
// This is the binary search algorithm, which speed is 0(log(N))
// In this algorithm implementation we are not gonna searhc elemen itself. We are gonna find the borders of sublist which contains this element or elements


public class BinarySearch {
    public static void main(String[] args) {
        int[] ar1 = binary_search(new int[]{1, 2, 3, 5, 5, 6, 7}, 5);
        int[] ar2 = binary_search(new int[]{1, 2, 3, 4}, 5);
        int[] ar3 = binary_search(new int[]{7, 8, 9}, 5);
        int[] ar4 = binary_search(new int[]{5, 5, 5, 5, 5, 5, 5}, 5);
        int[] ar5 = binary_search(new int[]{1, 2, 3, 4, 6, 7, 8}, 5);
        boolean DEBUG = true;
        if(DEBUG) {
            Arrays.stream(ar1).forEach(el -> System.out.print(el + " "));
            System.out.println();
            System.out.println("----------------------------------------");
            Arrays.stream(ar2).forEach(el -> System.out.print(el + " "));
            System.out.println();
            System.out.println("----------------------------------------");
            Arrays.stream(ar3).forEach(el -> System.out.print(el + " "));
            System.out.println();
            System.out.println("----------------------------------------");
            Arrays.stream(ar4).forEach(el -> System.out.print(el + " "));
            System.out.println();
            System.out.println("----------------------------------------");
            Arrays.stream(ar5).forEach(el -> System.out.print(el + " "));
        };




    }


    public static int left_boundary(int[] array, int element) {
        // first of all I want to find left boundary. If we are searching for 5 in array [1, 2, 3, 5, 5, 6, 7] - left boundary index would be 2

        int right = array.length;
        int left = 0;
        while (right > left+1) {
            int current = (left + right) / 2;
            if (array[current] >= element) right = current;
            else if (array[current] < element) left = current;
        }
        return left;
    }


    public static int right_boundary(int[] array, int element) {
        //  second step is searching for right boundary, If we are searching for 5 in array [1, 2, 3, 5, 5, 6, 7] - right boundary index would be 5
        int right = array.length;
        int left = 0;
        while (right > left+1) {
            int current = (left + right) / 2;   // shooting to the middle of an array
            if (array[current] > element) right = current;
            else if (array[current] <= element) left = current;
        }
        return right;
    }


    public static int[] binary_search(int[] array, int element) {
        // the third step is to return an array which contains left and right boundaries
        int[] boundaries = new int[2];
        boundaries[0] = left_boundary(array, element);
        boundaries[1] = right_boundary(array, element);
        return new int[]{left_boundary(array, element), right_boundary(array, element)};
    }
}
