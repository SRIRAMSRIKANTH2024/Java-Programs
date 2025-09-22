import java.util.Scanner;
     public class VowelPrinting {
           public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String input = sc.nextLine();
             String[] arr = input.split("[^aeiouAEΙΟΥ]");
            for (String str: arr) {
           System.out.print(str);
            }
           }
        }