import java.util.Scanner;

public class l1q6 {
    public static void main(String[] args) {
        double a1,a2,a3;
        System.out.println("Enter your age :");
        Scanner sc1 = new Scanner(System.in);
        a1=sc1.nextDouble();
        System.out.println("Enter your age :");
        Scanner sc2 = new Scanner(System.in);
        a2=sc2.nextDouble();
        System.out.println("Enter your age :");
        Scanner sc3 = new Scanner(System.in);
        a3=sc3.nextDouble();
        if (a1>a2 && a1>a3)
        {
            System.out.println("Oldest age is :"+a1);
        }
        else if (a2>a1 && a2>a3)
        {
            System.out.println("Oldest age is :"+a2);
        }
        else
        {
            System.out.println("Oldest age is :"+a3);
        }
        if (a1<a2 && a1<a3)
        {
            System.out.println("Yougest age is :"+a1);
        }
        else if (a2<a1 && a2<a3)
        {
            System.out.println("Yougest age is :"+a2);
        }
        else
        {
            System.out.println("Yougest age is :"+a3);
        }
    }
}
