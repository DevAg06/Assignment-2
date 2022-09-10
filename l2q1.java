import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class l2q1 {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        y= sc.nextInt();
        if (((y%4==0)&&(y%100!=0))||(y%400==0)){
            System.out.println("Leap year");

    }
    else{
        System.out.println("Not a leap year");
    }
    
}}
