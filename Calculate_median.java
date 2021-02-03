import java.util.Scanner;

/*
    Given an array arr[] of N integers, calculate the median
*/
public class Calculate_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //sort array
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;    
            }
            arr[j+1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        //find median
        int median = 0;
        if (arr.length % 2 == 0)
        {
            median = (arr[arr.length / 2] + arr[(arr.length / 2)-1]) / 2;
        }
        else
        {
            median = arr[(arr.length /2)];
        }
        System.out.println("Median : "+median);
        sc.close();
    }
}
