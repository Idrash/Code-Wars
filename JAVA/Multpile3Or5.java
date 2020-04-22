/**
 * KATA : https://www.codewars.com/kata/514b92a657cdc65150000006
 */
public class Multpile3Or5 {
	public int solution(int number) {
		//Solution :mult 3 + mult 5 - mult 15(3*5)
		number -= 1;
		return sumMultiplicationTable(number,3) + sumMultiplicationTable(number,5) - sumMultiplicationTable(number,15);
	}
	
	public static int sumMultiplicationTable(int number,int mult) {
		int numberDivByMult = number/mult;
		return (int) (mult*numberDivByMult*(numberDivByMult+1)/2); //sum formula (n*(n+1))/2
	}
}
