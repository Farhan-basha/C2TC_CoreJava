package com.tns.dayone;

public class RCB_Teams {
	public String name;

	public int age;

	public int jerseyNo;

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}
	
	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	public int getjerseyNo() {
		return jerseyNo;
	}

	public void setjersyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public static void main(String[] args) {
		RCB_Teams rc = new RCB_Teams();

		rc.setName("Ronaldo");
		rc.setage(39);
		rc.setjersyNo(7);
		
		System.out.println(rc.getName());
		
		System.out.println(rc.getage());
		
		System.out.println(rc.getjerseyNo());


		
		
		
	}


}
