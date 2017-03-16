/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *      |_  Loop
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class Loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] job = { "마법사", "영주", "기사", "농민" };
		int choice, at = 100;
		while (true) {
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			choice = scanner.nextInt();
			System.out.println("메뉴 입력 => " + choice);
			if (choice == 1) {
				at += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + at);
				System.out.println("--------------------");
			} else if (choice == 2) {
				at -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + at);
				System.out.println("--------------------");
			} else if (choice == 3) {
				Random random = new Random();
				int num = random.nextInt(4);
				System.out.println(job[num] + "(으)로 설정되었습니다.");
			} else if (choice == 9) {
				System.out.println("이제 공부하세요!");
				break;
			} else
				System.out.println("없는 메뉴입니다!!");

		}
	}
}
