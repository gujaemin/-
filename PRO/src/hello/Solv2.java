package hello;

public class Solv2 {
	public static void main(String[] argus) {
		
		for (int i = 2; i < 10; i ++) {
			
			
			for (int j = 1; j < 10; j ++) {
				int result = i * j;
				if(i > 4)
					break;

				System.out.print(i +"*" + j +"=" + result+"\t" );
			}
			System.out.println();
		}
	}
}
