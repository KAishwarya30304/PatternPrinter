package pat_print;
import java.util.*;
public class inver_tri_pat {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows=scanner.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
					System.out.print(j);
					if(j==i) {
						break;
					}
					System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
