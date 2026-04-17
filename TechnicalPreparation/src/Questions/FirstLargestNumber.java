package Questions;

public class FirstLargestNumber {

	public static void main(String[] args) {
		System.out.println("first largest number");
		int Array[] = {10,30,34,24,98,76,34};
		int largestVal = Array[0];
		int secondLarVal = Array[1];
		
		if (largestVal<secondLarVal) {
			int temp = largestVal;
			largestVal = secondLarVal;
			secondLarVal = temp;
		}
		for (int i = 0; i < Array.length; i++) {
			if (largestVal<Array[i]) {
				secondLarVal = largestVal;
				largestVal=Array[i];
			}
			else if (secondLarVal<Array[i]&&Array[i]!=largestVal) {
				secondLarVal=Array[i];
			}
		}
		System.out.println(largestVal);
		System.out.println(secondLarVal);

	}

}
