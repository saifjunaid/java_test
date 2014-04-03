package com;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my first change in repo");
		String data="“Dragons Aren’t Fireproof”";
		StringBuffer sb=new StringBuffer();
		test(data,sb);
		System.out.println(data);
		System.out.println(sb);
		System.out.println("Git Demo ");
	}

	static void test(String nData,StringBuffer sb){
		nData="Dragons Aren't Fireproof";
	//	sb=sb.substring(1, sb.length()-1);
	}
}
