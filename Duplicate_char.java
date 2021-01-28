import java.util.Scanner;

public class Duplicate_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();

        //convert string into array
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();
        char reserve[] = new char[str1.length()];

        for (int i = 0; i < string1.length; i++) {
            for (int j = 0; j < string2.length; j++) {
                if (string1[i] == string2[j]) 
                {
                    reserve[i] = string1[i];
                }
            }
        }

        System.out.println("Duplicate characters are : ");
        for (int i = 0; i < reserve.length; i++) {
            for (int j = i+1; j < reserve.length; j++) {
                if (reserve[i] == reserve[j])
                {
                    reserve[j] = ' ';
                }
            }
            System.out.println(reserve[i]);    
        }

        sc.close();
    }
}
