import java.util.*;
public class l1q11{
	public static void main(String args[]){
		char al;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Aplhabet :");
		al=sc.next().charAt(0);
		if (al>='a' && al<='z')
{
		System.out.println("Lowercase");
}
	else if (al>='A' && al<='Z'){
		System.out.println("Uppercase");
	}
		
}
}