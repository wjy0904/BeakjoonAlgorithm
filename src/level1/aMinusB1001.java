package level1;

import java.util.Scanner;

public class aMinusB1001 {

	public static void main(String[] args) {
		
		// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new java.util.Scanner(System.in);
		int a = 0;
		int b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a - b);
		
		sc.close();

	}

}
