import java.util.ArrayList;

public class ArraylistIntro {

	public static void main(String[] args) {
	
		//ArrayList is a class in java.
		//To access any methods present in class, we have to create object of the class.
		//object.method
		//Class objectName = new className(new will allocate memory)
		
		ArrayList<String> a = new ArrayList<String>();  
		a.add("sanjeev");
		a.add("Mane");
		a.add("Selenium");
//		a.remove(2);
		System.out.println(a.get(2));
		
		for (int i = 0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("********************");
		
		for(String val :a)
		{
			System.out.println(val);
		}
		
		//Item is present in arrayList
		
		System.out.println(a.contains("Selenium"));
		

	}

}
