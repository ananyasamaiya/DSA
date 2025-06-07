class Merge_2_Sorted_Arrays {
    public static void merging(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        for (int i = 0; i < m; i++) {
            if (a[i] > b[0]) {
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

    
                int first = b[0];
                int k;
                for (k = 1; k < n && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                b[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 12, 14};
        int[] b = {1, 2, 3};

        merging(a, b);

        printArray(a);
        printArray(b);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
