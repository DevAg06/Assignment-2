import java.util.*;
class l1q1{
    public static void main(String args[]){
        int l,b;
        System.out.println("Enter the Length :");
        Scanner sc1 = new Scanner(System.in);
        l = sc1.nextInt();
        System.out.println("Enter the Breadth :");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();
        if (l==b)
        System.out.println("The shape is square");
        else
        System.out.println("The Shape isn't square");
    }
}