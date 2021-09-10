import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class MergeaAndFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
				
		
		//merge 2 list
		List<String> names1=Arrays.asList("Man","Don","Women");
		Stream<String> nl=Stream.concat(names.stream(), names1.stream());
		//nl.sorted().forEach(System.out::println);
		
		
		//only consider the element where Adam is present
		/*boolean flag=nl.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);*/
		
		
		//create a list with the newly derived stream element 
		List<String> ls=Stream.of("Abhay","Shuruchi","Arushi","Bala").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);
		System.out.println(ls.get(0));
		
		
		
		//identify distinct elements
		/*nl.distinct().forEach(s->System.out.println("distinc objects are:"+s));*/

		
		//sort distinct elements and get the 3rd element
		String result=nl.distinct().sorted().collect(Collectors.toList()).get(2);
		System.out.println("The 3rd element is "+result);
				
				
		
	}

}
