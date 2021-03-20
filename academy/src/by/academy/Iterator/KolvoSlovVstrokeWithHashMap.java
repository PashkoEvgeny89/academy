package by.academy.Iterator;

import java.util.HashMap;

public class KolvoSlovVstrokeWithHashMap {

	public static void main(String[] args) {
		String str = "Hello! How are you? Where are you from?";
		
		
		String[] arst = str.split(" ");
		System.out.println(arst.length);

		HashMap<Integer, String> map = new HashMap<>();
		
		for  (String s:arst) {
			map.put(1, s);
		}
		System.out.println(map);
		
		System.out.println(String.class);

	}

}
