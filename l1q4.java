import java.util.*;
public class l1q4{
    public static void main(String args[]){
        double y,s,ts;
        System.out.println("Enter the year of service :");
        Scanner sc1 = new Scanner(System.in);
        y=sc1.nextDouble();
        System.out.println("Enter the salary :");
        Scanner sc2 = new Scanner(System.in);
        s=sc2.nextDouble();
        if (y>5)
        {
            ts=s+(0.05)*(s);
            System.out.println("Total salary is :"+ts);
        }
        else
        {
            System.out.println("Total salary is :"+s);
        }


    }
}

