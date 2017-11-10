public class InsertionSort {


    // ex 2.1-1 & 2.1-2
    // insertion sort in increasing & decreasing order


    public static void main(String[] args) {

        int[] arr = {0, 24, 241, 4, 6876, 4, 321, 6, 234, 565712, 325, 3234, 5524, 53};
        insertionSort(arr);
        System.out.println();
        decreasingInsertionSort(arr);

    }

    // insertion sort, increasing order
    public static void insertionSort(int[] arr) {

        int key, i;

        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j - 1;
            while (i > -1 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    // insertion sort, decreasing order
    public static void decreasingInsertionSort(int[] arr) {

        int key, i;

        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j - 1;
            while (i > -1 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }


}
