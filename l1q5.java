import java.util.Scanner;

public class l1q5 {
    public static void main(String[] args) {
        double m;
        System.out.println("Enter the marks :");
        Scanner sc = new Scanner(System.in);
        m=sc.nextDouble();
        if (m<=25)
        {
            System.out.println("Your Grade is :F");
        }
        else if(m>25 && m<=45)
        {
            System.out.println("Your Grade is :E");
        }
        else if(m>45 && m<=50)
        {
            System.out.println("Your Grade is :D");
        }
        else if(m>50 && m<=60)
        {
            System.out.println("Your Grade is :C");
        }
        else if(m>60 && m<=80)
        {
            System.out.println("Your Grade is :B");
        } 
        else if(m>80)
        {
            System.out.println("Your Grade is :A");
        } 
    }
}
