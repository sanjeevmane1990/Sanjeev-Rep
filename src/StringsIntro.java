
public class StringsIntro {

	public static void main(String[] args) {
		
		//String is an object// String literal-Refer to same object if declared twice
		
		String s1 = "Sanjeev Mane";
		String s2 = "Sanjeev Mane";
		
		//new - will create memory space for same object
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String s = "Sanjeev Mane Selenium";
		String[] splittedString = s.split("Mane");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		//Print character by Character
//		for(int i = 0; i<s.length(); i++)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		//Print string in reverse order
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
			
		
	}

}
