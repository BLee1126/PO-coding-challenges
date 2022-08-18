package com.Main;

public class Driver {
	
	public static String yourNameIsMine(String M, String W) {
		String ref;
		String test;
		if(M.length() > W.length()) {
			ref = W;
			test = M;
		}
		else {
			ref = M;
			test = W;
		}
		int strLength = ref.length();
		for(int i = 0; i < strLength; i++) {
			for(int j = 0; j < test.length(); j++) {
				if(ref.charAt(i) == test.charAt(j)) {
					test = test.substring(j+1);
					break;
				}
				
				if(j == test.length() - 1) {
					return "NO";
				}
			}
		}
		
		return "YES";
		
	}
	
	public static void walkOnTheAxis(int T, int[] N) {
		for(int i = 0; i < T; i++) {
			int leftIndex = 0;
			int rightIndex = N[i];
			int lastSpot = rightIndex;
			int distance = N[i];
			for(int j = 0; j <= N[i]; j++) {
				if(j % 2 == 0) {
					distance += Math.abs(lastSpot - rightIndex);
					lastSpot = rightIndex;
					rightIndex--;
					
				}
				else {
					distance += Math.abs(lastSpot - leftIndex);
					lastSpot = leftIndex;
					leftIndex++;
				}
				
			}
			System.out.println(distance);

		}
		
		
	}
	
	public static void main(String[] args) {
		
		int T = 2;
		int[] N = new int[T];
		N[0] = 1;
		N[1] = 2;
		walkOnTheAxis(T, N);
	
		
		System.out.println(yourNameIsMine("john","johanna"));
		System.out.println(yourNameIsMine("ira","ira"));
		System.out.println(yourNameIsMine("kayla","jayla"));
		
	}
}
