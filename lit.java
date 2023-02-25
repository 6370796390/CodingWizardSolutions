import java.util.Scanner;
public class lit {
public Static void main (String[] args ){
  Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print(get(n, arr));

	}

	static int get(int n, int[] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0)
				count++;
		}
		return count;
	}

}
