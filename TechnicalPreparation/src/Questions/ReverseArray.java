package Questions;

public class ReverseArray {

	public static void main(String[] args) {
		
		int Arr[] = {34,21,43,23,65,76,98,12,26,20};
		int start = 0;
		int end = Arr.length-1;
		
		while (start<end) {
			int reverse=Arr[start];
			Arr[start]=Arr[end];
			Arr[end]=reverse;
			start++;
			end--;
		}
		
		for (int i : Arr) {
			System.out.println(i);
		}
		
		
	}

}
