import java.util.*;

public class TestMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> treemap=new TreeMap();
		treemap.put("Maruti",6000000);
		treemap.put("Toyota",7000000);
		treemap.put("BMW",3000000);
		treemap.put("Maruti",7000000);
		
		int i=treemap.get("BMW");
		System.out.println(i);
		System.out.println(treemap.containsKey("Maruti"));
		System.out.println(treemap.containsValue(6000000));
		treemap.remove("Toyota");
		// we are traversing the map using indirect iterator
		// So that we are storing the key from treeset in set because set allows 
		//only unique objects or keys and in map the keys are unique.
		Set<String> set=new TreeSet();
		
		for(String s:set){
			System.out.println("For key :"+s+"Value is:"+treemap.get(s));
		}
		System.out.println("TreeMap :"+treemap);
		
		
		Map<String,Integer> hashmap=new HashMap();
		hashmap.put("Maruti",6000000);
		hashmap.put("Toyota",7000000);
		hashmap.put("BMW",3000000);
		hashmap.put("Maruti",7000000);
		
		System.out.println("HashMap:"+hashmap);
	}

}
