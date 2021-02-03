import java.util.Scanner;

/*
    Given an array of size N containing only 0s, 1s, and 2s; sort the
    array in ascending order.
*/
public class Sort_asc {

    static void sortArray(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }

        System.out.println("Sorted array : ");
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int []arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr, arr.length);

        sc.close();
    }
}
