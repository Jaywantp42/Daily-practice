import java.util.Scanner;

/*Write a program to remove all the duplicate characters from a given input String */

public class Remove_duplicate {
    public static void main(String[] args) {
        
        System.out.println("Enter any string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //char firstChar = str.charAt(0);
        int i,j;

        //convert string into character
        char string[] = str.toCharArray();

        for(i=0; i<string.length; i++)
        {
            for(j=i+1; j<string.length; j++)
            {
                if (string[i]==string[j] && string[i] != ' ' && string[i] != '0')
                {
                    string[j] = '*';
                }
            }
        }

        System.out.println("String is : ");
        for(i=0; i<string.length; i++)
        {
            System.out.print(string[i]);
        }
    }
}
