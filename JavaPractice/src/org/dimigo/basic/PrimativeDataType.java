/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *      |_  PrimativeDataType
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class PrimativeDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 아이유 프로필 >>");
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		System.out.println("이름 : "+ name);
		if(isMale == false) System.out.println("성별 : 여자");
		else  System.out.println("성별 : 남자");
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+bloodtype+"형");
		

	}

}
