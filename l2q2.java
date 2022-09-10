
import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args) {
        double age;
        char ms,sex;
        System.out.println("Enter the age :");
        Scanner sc =  new Scanner(System.in);
        age = sc.nextDouble();
        System.out.println("Enter the sex (M/F) :");
        Scanner sc1 =  new Scanner(System.in);
        sex = sc1.next().charAt(0);
        System.out.println("Enter your marital status :");
        Scanner sc2 =  new Scanner(System.in);
        ms = sc2.next().charAt(0);
        if (sex=='F' || sex=='f')
        {
            System.out.println("You will work in urban areas");
        }
        else if (sex=='M' || sex=='m' && age>=20 && age<=40)
        {
            System.out.println("You can work anywhere.");
        }
        else if (sex=='M' || sex=='m' && age>=40 && age<=60)
        {
            System.out.println("You can work in urban areas.");
        }
    }

}
