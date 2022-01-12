package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("companyname is CTS");
	}
	private void companyId() {
		System.out.println("companyId is 345");
	}
private void companyaddress() {
	System.out.println("companyaddress is velachery");
}
public static void main(String[] args) {
	CompanyInfo a=new CompanyInfo();
	a.companyName();
	a.companyId();
	a.companyaddress();
}
}