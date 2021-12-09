package com.eg;

public class ExceptionEg {
	
	public static String method(String s, int i) throws Exception {
		
		if (s == null) {
			throw new NullPointerException("NullPointer Exception");
		}
		
//		s.charAt(0);
		i = i/0;
		return s;
	}
	
	public static void main(String[] args) {
		String s = null;
		
		try {
			method(s, 2);
			method("ab", 2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
