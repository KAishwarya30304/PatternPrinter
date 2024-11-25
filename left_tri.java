package pat_print;
import java.util.*;
public class left_tri {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows for the triangle: ");
		        int rows = scanner.nextInt();

		        for (int i = 1; i <= rows; i++) {

		            for (int j = 1; j <= rows; j++) {
		                System.out.print(" * ");
		            }
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}
}