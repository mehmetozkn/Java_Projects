public class Heap {

    String heap[];
    int size;

    public Heap(int N) {
        heap = new String[N];
        size = 0;

    }

    int parent(int index) {
        return (index - 1) / 2;
    }

    void swap(int i, int j) {
        String temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(String data) {
        // heape veri ekleme fonksiyonu
        if (size < heap.length) {
            heap[size] = data;

            int current = size++;
            int parent = parent(current);

            while (heap[parent].compareTo(heap[current]) > 0) {
                swap(parent, current);
                current = parent;
                parent = parent(current);
            }
        } else {
            System.out.println("Heap is full!");
        }
    }

    public void sort(String arr[]) {
        // Heap Sort
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public int numberOfWord(String str) {
        // Heape eklenen verinin(Doc1(5)) kaç defa geçtiğini parantez içinden çeken fonksiyon.
        int start = 0;
        int finish = 0;
        if (str.length() == 0) return 0;
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') start = i + 1;
                if (str.charAt(i) == ')') finish = i;

            }
            if (start == 0 && finish == 0) return 0;
            return Integer.parseInt(str.substring(start, finish));
        }


    }

    public void heapify(String arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && numberOfWord(arr[l]) < numberOfWord(arr[largest]))
            largest = l;

        if (r < n && numberOfWord(arr[r]) < numberOfWord(arr[largest]))
            largest = r;

        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

}
