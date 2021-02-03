import java.util.Scanner;

/*
    An array contains both positive and negative numbers in random order.
    Rearrange the array elements so that all negative numbers appear before all
    positive numbers. Examples :
*/
public class Pos_neg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j=0, temp=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)
            {
                if(i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;    
            }
        }

        System.out.println("After sorting : ");
        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();
    }
}
