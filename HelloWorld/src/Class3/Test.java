package Class3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ArrayList/Scanner이용
		//학생들의 수학점수를 읽어들이는 프로그램
		//-1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다
		// 1. 모든 학생의 점수를 출력
		// 2.점수의 총합계,평균점수를 계산해서 출력
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int num = s.nextInt();
		int sum = 0;
		ArrayList<Integer> point=new ArrayList<Integer>();
		//while(!str.equal
		while(num!=-1) {
			point.add(num);
			sum += num;
			num = s.nextInt();
		}
		s.close();
		System.out.println("학생들 점수"+point);
		System.out.println("학생들 총점"+sum);
		System.out.println("학생들 평균은"+(sum/point.size()));
	}

}
