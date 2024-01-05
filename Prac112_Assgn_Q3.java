import java.util.*;
public class Prac112_Assgn_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n");
		int n = sc.nextInt();
		int sum=0;
		int count=1;
		int random;
		System.out.println("Random numbers generated are: ");
		do {
			random = (int)(Math.random()*n+1);
			System.out.println(random);
			sum = sum + random;
			count++;
		}while(count<=n);
		
		int average = sum/n;
		System.out.println("the average is: "+ average);

	}

}
