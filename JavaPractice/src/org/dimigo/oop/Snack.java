/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *      |_  Snack
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class Snack {
	private String company;
	private String name;
	private int number;
	private int price;
	
	public Snack(){}
	public Snack(String newName, String newCompany, int newPrice, int newNumber){
		name = newName;
		company = newCompany;
		price = newPrice;
		number = newNumber;
		
	}
	public String getCompany(){
		return company;
	}
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public int getPrice(){
		return price;
	}

	public void setCompany(String newCompany){
		company= newCompany;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setPrice(int newPrice){
		price = newPrice;
}
	public void setNumber(int newNumber){
		number = newNumber;
	}
	public int calcPrice(){
		return price*number;
	}
	public String toString() {
		return "이름 : " + name + "\n제조사 : " + company+ "\n가격 : " + String.format("%,d",price) + "원\n개수 : " + number + "개\n";
	}
	
	
	
	
	
}
