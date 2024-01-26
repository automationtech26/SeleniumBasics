package sequence7_JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams1 {

	
	//Regular approach of ArrayList
	@Test
	public void testArrayListWithoutStreams() {		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("atest1");
		arrayList.add("btest2");
		arrayList.add("atest3");
		arrayList.add("btest4");
		
		int count = 0;
		for(int i = 0; i< arrayList.size(); i++) {
			if(arrayList.get(i).startsWith("a")) {
				count++;
			}
		}
		System.out.println("count: " + count);
	}
	
	/*
	 * 
	 * There is not meaning of intermediate -> operation if there is no terminal operation
	 * Terminal operation will only execute if intermediate operation is true
	 * We can create streams
	 * how to use filter in Stream API
	 * convert arrayList to streams, then apply filter, then condition -> then terminal operator
	 * 
	 * */
	
	
	@Test
	public void testArrayListWithStreams() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("atest1");
		arrayList.add("btest2");
		arrayList.add("atest3");
		arrayList.add("btest4");
		
		//Approach 1
		long count =  arrayList.stream().filter(s-> s.startsWith("a")).count();
		System.out.println(count);
		
		
		
		//Approach 2
		Stream.of("atest1", "btest2", "atest3", "btest4").filter(s->s.startsWith("a")).count();
		
		
		
		//Approach 3, here we won't response as its showing false
		long d = Stream.of("atest1", "btest2", "atest3", "btest4").filter(s->
		{
			s.startsWith("A");
			return false;
		}).count();
				
		System.out.println(d);
		
		
		
		//Approach 4
		arrayList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
	}

}
