package pat_print;
import java.util.Scanner;
public class right_tri {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows=scanner.nextInt();
		int space=rows-1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
					System.out.print(" ");
					}
					for(int k=1;k<=i;k++) {
						System.out.print("*");
				
			}
					space--;
					
			System.out.println();
		}
	}

}
