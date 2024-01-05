import java.util.*;
public class Prac112_Assgn_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n");
		int n = sc.nextInt();
		int sum=0;
		int count=1;  //1 to n
		int random;
		System.out.println("Random numbers generated are: ");
		do {
			random = (int)(Math.random()*n+1);    //random values by computer
			System.out.println(random);	      //adding the random values
			sum = sum + random;
			count++;
		}while(count<=n);
		
		int average = sum/n;			      //calculating average
		System.out.println("the average is: "+ average);

	}

}
