public class BubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] a = Array1.data;

        long start = System.nanoTime();
        ob.bubbleSort(a);
        long end = System.nanoTime();
        
        long duration = end - start;

        System.out.println();
        System.out.println("Bubble Sort Selesai");
        System.out.println("Waktu Eksekusi: " + (duration / 1_000_000.0) + " ms (" + (duration / 1_000_000_000.0) + " s)");
    }
}
