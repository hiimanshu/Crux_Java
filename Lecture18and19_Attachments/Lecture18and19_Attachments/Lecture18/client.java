package Lecture18;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(3);
		map.put("India", 300);
		map.put("USA", 200);
		map.put("Russia", 250);
		map.put("UK", 175);
		map.put("China", 320);
		map.put("Africa", 180);
		//map.put("Ireland",220);
		
		map.display();
//		System.out.println(map.get("Aus"));
		
//		System.out.println(map.remove("Ireland"));
//		map.display();
		map.put("Ireland",220);
		map.display();
	}

}
