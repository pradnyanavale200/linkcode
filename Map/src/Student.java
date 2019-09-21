import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grades g1 = new Grades(11,12,13);
		Grades g2 = new Grades(23,27,38);
		Grades g3 = new Grades(34,56,90);
		
		Map<String, Grades> map = new HashMap();
		map.put("rama",g1);
		map.put("renu", g3);
		map.put("gma",g2);
		
		print(map);
		//now to make it in sorted order we use treemap
		//treemap takes much time than hashmap so we r inserting in hashmap an d then passing its obj 
		//to treemap to get o/p in sorted order
		Map<String, Grades> treemap = new TreeMap<String, Grades>(map);
		print(treemap);
		System.out.println();
		printw(map);
		
	}
	public static void print(Map map)
	{
		Set<String> st = map.keySet();
		for(String g:st)
		{
			Grades w1 =(Grades)map.get(g);
			System.out.println("average "+g+"is"+w1.getAverage());
		}
	}
	public static void printw(Map map)
	{
		Set set = map.entrySet();
		Iterator it= set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry)it.next();
			String key = (String)entry.getKey();
			Grades g = (Grades)entry.getValue();
			System.out.println("for key"+key+"avg is"+g.getAverage());
			
			
		}
		
		
	}

}
