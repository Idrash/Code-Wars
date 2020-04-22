/**
 * KATA : https://www.codewars.com/kata/5d16af632cf48200254a6244
 */
public class StrongestEvenNumber {
	  public static int strongestEven(int n, int m) {
		  int maxLog = (int)(Math.log(m)/Math.log(2));// le plus grand possible (si dans l'intervale)
		  int repeat = 1; //nombre de repetition
		  int value=(int) Math.pow(2, maxLog);
		  int nextValueTest;

		  while(value<n) {
			  nextValueTest = (int) (value+(Math.pow(2, maxLog-repeat)));
			  if(nextValueTest<=m) value = nextValueTest;
			  repeat++;
		  }
	      return value;
	  }
}
