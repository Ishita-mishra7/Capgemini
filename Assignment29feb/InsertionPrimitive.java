package Assignment29feb;

public class InsertionPrimitive {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
