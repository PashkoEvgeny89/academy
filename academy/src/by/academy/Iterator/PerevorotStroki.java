package by.academy.Iterator;

import java.util.ArrayList;

public class PerevorotStroki {

	//revers1
	public static String revers1(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();

	}

	//revers2
	public static String revers2(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	//revers3
	public static String revers3(String s) {
		char[] arch=s.toCharArray();
		for (int i=0; i<arch.length/2; i++) {
			char temp=arch[i];
			arch[i]=arch[arch.length-1-i];
			arch[arch.length-1-i]=temp;
		}
		return new String(arch);
	}
	
	//reverse4
	public static String revers4(String s) {
		String[] arst=s.split("");
		StringBuilder sb=new StringBuilder();
		for (int i=arst.length-1; i>=0; i--) {
			sb.append(arst[i]);
		}
		return sb.toString();			
	}
	
	
	
	public static void main(String[] args) {

		String str = "Hello World!";

		System.out.println(PerevorotStroki.revers1(str));

		System.out.println(PerevorotStroki.revers2(str));
		
		System.out.println(PerevorotStroki.revers3(str));
		
		System.out.println(PerevorotStroki.revers4(str));

	}

}
