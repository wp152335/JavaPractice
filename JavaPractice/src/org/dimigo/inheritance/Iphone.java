/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *      |_  Iphone
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class Iphone extends SmartPhone{
	public Iphone(){
		
	}
	public Iphone(String model,String company,int price){
		super(model, company, price);
	}
	public void pay(){
		System.out.println("애플페이로 결제합니다.");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다");
	}
	
}
