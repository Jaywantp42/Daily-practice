import java.util.Scanner;

/*Write a function to return minimum and maximum in an array.*/
public class Min_max_from_array {

    static void minMaxFromArray(int arr[], int arrSize)
    {
        //int temp;
        for(int i=1; i<arrSize; i++)
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

        System.out.println("Minimum from array : "+arr[0]);
        System.out.println("Maximum from array : "+arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter array elements : s");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //function
        minMaxFromArray(arr, arr.length);

        sc.close();
    }
}
