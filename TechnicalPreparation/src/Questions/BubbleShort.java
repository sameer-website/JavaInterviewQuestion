package Questions;

public class BubbleShort {

	public static void main(String[] args) {
		int Arr[] = {10,4,2,9,6,1,8};
		for (int i = 0; i < Arr.length-1; i++) {
			for (int j = 0; j < Arr.length-1-i; j++) {
				if (Arr[j]>Arr[j+1]) {
					int temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}
			}
		}
		for (int num : Arr) {
			System.out.println(num +" ");
		}
	}

}
