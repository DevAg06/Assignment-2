import java.util.Scanner;

public class l1q8 {
    public static void main(String[] args) {
        double ch,ca,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of classes held :");
        ch=sc.nextDouble();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the no. of classes attended :");
        ca=sc1.nextDouble();
        per=(ca/ch)*100;
        if (per>=75)
        {
            System.out.println("You are eligible to give exam!");
        }
        else
        {
            System.out.println("You are not eligible to give exam!");
        }

    }
}
