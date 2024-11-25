package pat_print;
import java.util.*;
public class Rtri_pat {
	public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
System.out.print("enter number of rows: ");
int rows=scanner.nextInt();
for(int i=1;i<=rows;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
}
}
