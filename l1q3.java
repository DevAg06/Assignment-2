import java.util.*;
class l1q3{
    public static void main(String args[]){
        double q,dis,amt;
        System.out.println("Enter the quantity :");
        Scanner sc = new Scanner(System.in);
        q=sc.nextDouble();
        dis=(0.1)*(q*100);
        if (q>1000)
        {
            amt=(q*100);
            System.out.println("Your Total bill is :"+(amt-dis));
        }
        else
        {
            amt=q*100;
            System.out.println("Your Total bill is :"+amt);
        }
    }
}