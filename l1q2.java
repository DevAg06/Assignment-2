import java.util.*;
class l1q2{
    public static void main(String args[]){
        int n1,n2;
        System.out.println("Enter the First Number :");
        Scanner sc1 = new Scanner(System.in);
        n1 = sc1.nextInt();
        System.out.println("Enter the Second Number :");
        Scanner sc2 = new Scanner(System.in);
        n2 = sc2.nextInt();
        if (n1>n2)
        System.out.println(n1+" is Greatest");
        else
        System.out.println(n2+" is Greatest");
    }
}