import java.util.Scanner;

/*Write an efficient Java function that takes two strings as arguments and removes the characters
    from the first string which are present in the second string. */
public class Rem_duplicate_from_sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String str2 = sc.nextLine();

        //convert string into char array
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();

        for (int i = 0; i < string1.length; i++) {
            for (int j = 0; j < string2.length; j++) {
                if (string1[i] == string2[j])
                {
                    string1[i] = ' ';
                }
            }
            System.out.print(string1[i]);
        }

        //print first string
        // System.out.println("After removing duplicate second string is : ");
        // for (int i = 0; i < string1.length; i++) {
        //     System.out.print(string1[i]);
        // }

        sc.close();
    }
}
