//1) Arrange the array in ascending order
//2) Pick the 2nd element from the last and print it

package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		int length =data.length;
		Arrays.sort(data); //2,3,4,6,7,11 data is the name given for int
		System.out.println("The 2nd element from the last is " +data[length-2]); //length is unknown and hence the last 2nd element is being printed
	}

}
