/**
 * Kata : https://www.codewars.com/kata/5d5a7525207a674b71aa25b5
 */
public class RowOfTheOddTriangle {

	public static long[] oddRow(int n) {
		/*
		 * we can find a sum formula for the first number of th row: 2*0+1=1 , 2*(1)+1, 2*(1+2)+1, 2*(1+2+3)+1.
		 * we find this: 2*sum(1:n) +1
		 * calcule the first number of the row with sum = n*(n+1)/2 with n= n-1
		 */
		long firstNumberOfRow = ((long)(n-1) * n)+1;
		long[] result = new long[n];
		for(int i=0; i<n ; i++) {
			result[i]= firstNumberOfRow + 2*i;
		}
		return result;

	}
}
