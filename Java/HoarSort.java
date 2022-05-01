import java.util.Arrays;

public class HoarSort {
    public static void main(String[] args) {

        int[] ar1 = {4, 5, 6, 1, 4, 2, 1, 4, 6, 7, 8};
        hoarSort(ar1, 0, 10);
        Arrays.stream(ar1).forEach(el->System.out.print(el + " "));
        System.out.println();
        int[] ar2 = {5, 5, 5, 5, 5};
        hoarSort(ar2, 0, 4);
        Arrays.stream(ar2).forEach(el->System.out.print(el + " "));
        System.out.println();
        int[] ar3 = {-1, -2, -3, 7};
        hoarSort(ar3, 0, 3);
        Arrays.stream(ar3).forEach(el->System.out.print(el + " "));
        System.out.println();
        int[] ar4 = {};
        hoarSort(ar4, 0, 0);
        Arrays.stream(ar4).forEach(el->System.out.print(el + " "));
        System.out.println();
        int[] ar5 = {1, 2, 3, 4, 5};
        hoarSort(ar5, 0, 4);
        Arrays.stream(ar5).forEach(el->System.out.print(el + " "));
        System.out.println();
        int[] ar6 = {5,3,1,2,2,1,0};
        hoarSort(ar6, 0, 6);
        Arrays.stream(ar6).forEach(el->System.out.print(el + " "));


    }

    public static void hoarSort(int[] array, int start, int end) {
        // start is the first element's index and end is the last element's index
        if (start >= end) return;  //checking the end of recursion
        int breakPoint = hoarPartition(array, start, end);   // here we can divide our array
        // we don't need to replace element which has breakPoint index since it's already on it's place
        hoarSort(array, start, breakPoint - 1);   // here we sort left part of array
        hoarSort(array, breakPoint + 1, end);   //here we sort right part of array
    }


    public static int hoarPartition(int[] array, int start, int end) {
        int i = start + 1;  //we're gonna start our partition from the element with this index
        int barrier = array[start]; //this is the index of out barrier element
        int j = end;
        while (true) {
            while (i < end && array[i] < barrier) i++;   // searching for the element in the left side which is greater than barrier or equals to it 
            while (array[j] > barrier) j--;   //searching for the element which is less than barrier in the right side 
            if(i >= j) break;
            
            swap(array, i++, j--);  //swapping element since i element is greater than j element
        
        };
        swap(array, start, j);    // putting barrier element to it's place
        return j;
    }



    public static void swap(int[] array, int i, int j) {
        // swapping two elements
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    }
        

 
