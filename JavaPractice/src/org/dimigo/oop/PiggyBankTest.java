/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *      |_  PiggyBankTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember dad = new FamilyMember("아빠");
		FamilyMember mom = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember bro = new FamilyMember("남동생");

		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(dad, 10000);
		PiggyBank.putMoney(mom, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(bro, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
	}

}
