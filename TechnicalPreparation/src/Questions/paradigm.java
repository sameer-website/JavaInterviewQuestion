package Questions;

public class paradigm {

	public static void main(String[] args) {
		String checkVowels = "mdsAmeerua";
		int count = 0;
		for (int i = 0; i < checkVowels.length(); i++) {
			char string = Character.toLowerCase(checkVowels.charAt(i));
			if (string == 'a' || string == 'e' || string == 'i' || string == 'o' || string == 'u' ) {
				count++;	
			}
		}
		System.out.println(count);
		
	}

}
