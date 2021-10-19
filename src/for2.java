import java.util.Scanner;
public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);	
	
	int n = sc.nextInt();
	
	for (int i=0; i<n;i++) {
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if (y==0) {
			System.out.println("Divisão impossível!");
		}
		else
			System.out.println(x/y);
	}
	
	sc.close();	
		
	}

}
