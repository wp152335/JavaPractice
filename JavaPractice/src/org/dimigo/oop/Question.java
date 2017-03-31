/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *      |_  Question
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class Question {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder("<<결과 출력>>\n");
		String[] questions = { "1. 가장 좋아하는 가수는? ", "2.가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		String[] favorites = { "트와이스", "혜리", "체육" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 2; i++) {
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			result.append(questions[i]).append(favorites[i]).append("\n");
			if(answer.equals(favorites[i])) System.out.println("정답입니다!");
			else System.out.println("틀렸습니다!");
			
		}
		System.out.println(result);
		
	}
}
