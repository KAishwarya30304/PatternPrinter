package pat_print;
import java.util.*;
import java.util.Scanner;

public class x_pat {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows=scanner.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
					if(i==j||j+i==rows+1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
						
					}
				
			}
			System.out.println();
		}
	}

}
