package Questions;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String name = "vikashKumar";
		String result ="";
		for (int i = 0; i < name.length(); i++) {
			char data = name.charAt(i);
			if(result.indexOf(data)== -1) {
				result = result +data;
			}
			
		}
		System.out.println(result);
	}

}