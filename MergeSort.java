public class MergeSort {
    void merge(int[] a, int left, int mid, int right) {

        int leftLength = mid - left + 1;
        int rightLength = right - mid;

        
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = a[left + i];
        }

        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = a[mid + 1 + j];
        }

        int i = 0; 
        int j = 0; 
        int k = left; 

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            a[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }

    void sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(a, left, mid);
            sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] a = Array1.data;

        long start = System.currentTimeMillis();
        MergeSort ob = new MergeSort();
        ob.sort(a, 0, a.length - 1);
        long end = System.currentTimeMillis();
        long duration = end - start;

        double seconds = duration / 1000.0;

        System.out.println();
        System.out.println("Selesai Merge Sort");
        System.out.println("Waktu Eksekusi Merge Sort: " + duration + " ms (" + seconds + " s)");
    }
}
