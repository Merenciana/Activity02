import java.util.Scanner;
public class CalculateSum {
    public static void main(String[] args)
    {
        int i, num = 10, sum = 0;
        //executes until the condition returns true
        for(i = 1; i <= num; ++i){
            //adding the value of i into sum variable
            sum = sum + i;
        }
        //prints the sum
        System.out.println("Sum of first 10 positive numbers is: " + sum);
    }
}


