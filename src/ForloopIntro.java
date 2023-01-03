
public class ForloopIntro {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10};
		
		//for Loop
//		for(int i = 0; i<arr.length; i++)
//		{
//			
//			System.out.println(arr[i]);
//			
//		}
		
//		for(int i = 0; i<arr2.length; i++)
//		{
//			System.out.println(arr2[i]);
//		}
		
		String[] name = {"Sanjeev", "Mane", "Selenium"};
//		for(int i = 0; i<name.length; i++)
//		{
//			System.out.println(name[i]);
//		}
		
		//Enhanced for loop
		for(String s: name)
		{
			System.out.println(s);
		}

	}

}
