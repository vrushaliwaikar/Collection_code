import java.util.*;

public class TestGrades_map {

	public static void main(String[] args) {
		Grades_map g1=new Grades_map(60,50,60);
		Grades_map g2=new Grades_map(90,80,70);
		Grades_map g3=new Grades_map(90,60,90);
		
		Map map=new HashMap();
		map.put("suresh",g1);
		map.put("mahesh",g2);
		map.put("rajesh",g3);
		
		print(map);
		
		System.out.println();
		/*
		 Map <String,Grades_map>tmap=new TreeMap<String,Grades_map>(map); 
		 Here we can pass one collection to other
		 */
		
		Map tmap=new TreeMap(map);
		print(tmap);
	
		}
	public static void print(Map map){
	/*	Set<String> st=map.keySet();
		for(String s:st)
		{
			
			Grades_map g1=(Grades_map)map.get(s);   //always predefined method return the object so we type cast the main object in Grades_map object
			System.out.println("key :"+s+"\t"+g1.getAverage());
		
		}*/
		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) //object is present or not 
		{
			Map.Entry entry=(Map.Entry)it.next();
			String key=(String)entry.getKey();
			Grades_map g=(Grades_map)entry.getValue();
			System.out.println("for key:=>"+key+"\t Avg is:"+g.getAverage());
		}
	}

}
