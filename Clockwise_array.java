//import java.util.Scanner;

/*
    Given an array, rotate the array by one position in clockwise
    direction.
*/
public class Clockwise_array {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};

        int x = arr[arr.length-1];
        for(int i = arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = x;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
