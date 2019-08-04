import java.util.Scanner;

public class patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		pattern(n);
	}

	public static void pattern(int n) {
		int sum = n*(n+1);
		
		int start = 1, end = sum;
		for (int t = 0; t < n; t++)
		 {
			for (int i = start; i < start + n - t; i++) 
			{
				System.out.print(i + "" + 0);
			}
			for (int i = end - n + 1 + t; i <= end; i++)
			 {
				System.out.print(i);
				if (i != end) 
				{
					System.out.print(0);
				}
			}
			System.out.println();
			if (t == n - 1) 
			{
				break;
			}
			for (int i = 0; i <= t; i++)
			 {
				System.out.print("**");
			}
			start = start + n - t;
			end = end - n + t;
		}

	}

}
