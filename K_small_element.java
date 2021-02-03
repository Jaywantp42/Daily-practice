import java.util.Scanner;

/*
    Given an array arr[] and a number K where K is smaller than size
    of array, the task is to find the Kth smallest element in the given array. It is
    given that all array elements are distinct.
*/

public class K_small_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N :");
        int N = sc.nextInt();

        System.out.println("Enter value of K : ");
        int K = sc.nextInt();

        int []arr = new int[N];

        System.out.println("Enter array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //arrange array is sorted manner
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+"\t");
        // }

        //traverse array till Kth value
        for (int i = 0; i < arr.length; i++) {
            if( i == K)
            {
                System.out.println("Value of "+K+" element from array is : "+arr[i-1]);
            }
        }

        sc.close();
    }
}
