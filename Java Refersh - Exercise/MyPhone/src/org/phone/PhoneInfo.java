package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("phonename is samsung");
	}
	private void camera() {
		System.out.println("camera");
	}
	private void storage() {
		System.out.println("storage is 4gb ram");
	}
		private void osName() {
			System.out.println("os name is windows ");
		}
		public static void main(String[] args) {
			PhoneInfo a=new PhoneInfo();
			a.phoneName();
			a.camera();
			a.osName();
			a.storage();
		}
	}

