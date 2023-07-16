public class IndexOfMax {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 2, 10, 15, 5, 53, 31, 344, 55 };
        int arr2[] = { 10, -5, -15 };
        int arr3[] = { 10, 30, 50, 20, 10 };

        System.out.println(indexOfMax(arr1));
        System.out.println(indexOfMax(arr2));
        System.out.println(indexOfMax(arr3));

    }

    public static int indexOfMax(int[] arr) {
        int index = -1;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}
