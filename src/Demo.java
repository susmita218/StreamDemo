import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		
		for (int i=0; i<names.size(); i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{count++;}
		}
		System.out.println(count);
	}

}
