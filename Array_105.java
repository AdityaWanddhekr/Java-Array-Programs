public class Array_105 {
    // All sorting Algorithm.
    // 1.Bubble
    // 2.Selection.
    // 3.Insertion.
    // 4.Counting

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void insertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev > 0 && a[prev] > a[curr]) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = a[curr];
        }
    }

    public static void countingSort(int a[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (large < a[i]) {
                large = a[i];
            }
        }
        int count[] = new int[large + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                a[j] = i;
                count[i]--;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println(" original Array is : ");
        print(a);
        // Bubble sort.
        System.out.println();
        System.out.println("bubble sort is : ");
        bubbleSort(a);
        print(a);
        // Selection sort.
        System.out.println();
        System.out.println("Selection sort is : ");
        selectionSort(a);
        print(a);
        // Insertion sort
        System.out.println();
        System.out.println("Insertion sort is : ");
        insertionSort(a);
        print(a);
        // Counting sort
        System.out.println();
        System.out.println("Counting sort is : ");
        countingSort(a);
        print(a);

    }

}