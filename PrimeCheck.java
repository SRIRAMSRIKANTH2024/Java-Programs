import java.util.*;
public class PrimeCheck {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    boolean s=true;
    if(n<1){
    System.out.print("NO");
    return;
    }
    for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
            s=false;
            break;
            }
    }
    if(s)
    System.out.print("YES");
    else
    System.out.print("NO");
    }
}