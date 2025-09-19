import java.util.*;
public class StringReverse{
       public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          String str=sc.next();
          StringBuilder sb=new StringBuilder(str);
          String rev_str=sb.reverse().toString();
          System.out.println(rev_str);
}
}     