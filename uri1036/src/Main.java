import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	  double A, B, C, X, R1, R2;
	  
	  A = sc.nextDouble();
	  B = sc.nextDouble();
	  C = sc.nextDouble();
	   
	  double delta = B * B - 4.0 * A * C;
	  
	  if (A == 0 || delta < 0.00) {
		  System.out.println("Impossivel calcular");
	  }
	  else {
		  R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		  R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		  System.out.printf("R1 = %.5f%n", R1);
		  System.out.printf("R2 = %.5f%n", R2);
	  }
	  
	  sc.close();
		

	}

}
