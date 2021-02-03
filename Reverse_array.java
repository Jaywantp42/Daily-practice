import java.util.Scanner;

/*Given an array (or string), the task is to reverse the array/string. */

class Reverse_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();

        //convert string into array
        char string1[] = str.toCharArray();

        System.out.println("Reverse of string is :");
        for(int i = string1.length-1; i>=0; i--)
        {
            System.out.print(string1[i]);
        }
        sc.close();
    }
}