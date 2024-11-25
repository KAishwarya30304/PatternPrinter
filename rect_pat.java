package pat_print;
import java.util.Scanner;
public class rect_pat {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("enter number of rows: ");
	int rows=scanner.nextInt();
	System.out.print("enter number of clmn: ");
	int clmn=scanner.nextInt();
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=clmn;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

}
