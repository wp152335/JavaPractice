/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *      |_  SmartPhoneTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] sm = {
				new Iphone("iPhone7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000),
		};
		for(SmartPhone p : sm){
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFunction(p);
			p.turnOff();
		}
	}
	
}
