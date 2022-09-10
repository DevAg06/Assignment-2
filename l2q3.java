import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class l2q3 {
    public static void main(String[] args) {
        int n,rem=0,rev=0;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if (n<10)
        {
            System.out.println(n);
        }
        else
        {
            while(n!=0)
            {
                rem = n%10;
                rev = rev *10 +rem;
                n = n/10;
            }
            System.out.println("The reverse of a number is :"+rev);
        }
    }
}
