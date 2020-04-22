/**
 * KATA https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 */
public class MaximumSubarraySum {
	
  public static int sequence(int[] arr) {
	  int currentNumber = 0;
	  int maxNumber=0;
	  for(int i =0; i<arr.length; i++) {
		  currentNumber += arr[i];
		  //if we are a new max
		  if(currentNumber >= maxNumber) {
			  maxNumber = currentNumber;
		  }
		  //if a currentNumber <0 we reset
		  else if(currentNumber<=0) {
			  currentNumber = 0;
		  }
	  }
    return maxNumber;
  }
}