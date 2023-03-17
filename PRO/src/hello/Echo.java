package hello;

import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		
		Scanner strs = new Scanner(System.in);
		System.out.println("출력할 문장을 입력하세요!!");
		
		String sentence = strs.nextLine();
		
		System.out.printf("출력 문장: " + sentence);
		strs.close();
		
		
		

	}
}
