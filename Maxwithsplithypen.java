import java.util.Arrays;
import java.util.Scanner;

public class Maxwithsplithypen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        String input = sc.nextLine();

        String[] strarr = input.split("-");

        int[] numbers = new int[strarr.length];
        int arrayPosition = 0;

       
        for (String str : strarr) {
            numbers[arrayPosition++] = Integer.parseInt(str);
        }

        int max=0;
     
        for (int num : numbers) {
            if(num > max)
              max=num;
        }
     System.out.print(max);
    }
}
