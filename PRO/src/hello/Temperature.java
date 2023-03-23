package hello;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args){
		
		Scanner temps = new Scanner(System.in); 
		System.out.println("섭씨 온도로 바꿀 화씨온도를 입력하세요.");
		double tempF = temps.nextDouble();
		
		double tempC = 5.0/9.0 * (tempF - 32);
		
		System.out.printf("변환된 섭씨온도는 %.2f °C ", tempC); 
		
		temps.close();
		
	}

}
