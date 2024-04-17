package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Saving Account");
		}
		public void fixed() {
		System.out.println("Current Account");
		}
		public static void main(String[] args) {
		BankInfo bankInfo = new BankInfo();
		bankInfo.saving();
		bankInfo.fixed();
		bankInfo.deposit();
		}

}
