import java.util.Scanner;

/*Write an efficient Java program to return the maximum occurring character in the input string */

public class Max_occure_char {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        int []freq = new int[str.length()];
        char maxChar = str.charAt(0);
        int i, j, max;

        //convert string in char array
        char string[] = str.toCharArray();
        
        //count each word in string and store in freq array
        for (i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (j = i+1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] !='0') {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        max = freq[0];
        //If max is less than frequency of a character   
        //then, store frequency in max and corresponding character in maxChar
        for (i = 0; i < string.length; i++) {
            if(max < freq[i])
            {
                max = freq[i];
                maxChar = string[i];
            }
        }

        System.out.println("Maximum occuring character: "+ maxChar);

        sc.close();
    }
    
}