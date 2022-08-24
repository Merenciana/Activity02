import java.util.Scanner;
public class CalculateSum {
    public static void main(String[] args)
    {
        int i,n=0,s=0;
        {
            System.out.print("Input the 10 numbers : ");
        }
        for (i= 0; i < 10; i++)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            if(n > 0)
            s +=n;
           }
        System.out.println("The sum of first 10 positive numbers is : " +s);
    }
}


