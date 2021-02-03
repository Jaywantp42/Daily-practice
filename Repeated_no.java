import java.util.Scanner;

/*
    Given an array of integers nums containing n + 1 integers where each
    integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number .
*/
public class Repeated_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //check duplicate
        int repeat = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                   repeat = arr[i];     
                }
            }
        }

        System.out.println("Repeated number is : "+repeat);
        sc.close();
    }
}
