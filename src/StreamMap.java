import java.util.ArrayList;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
				
	Long c=names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
	names.stream().filter(s->s.startsWith("A")).count();
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).limit(1).forEach(s->System.out.println(s));
	names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).limit(1).forEach(s->System.out.println(s));
	

	}

}
