package com.collabra.atm;

import java.io.IOException;

public class Atm extends ATMTransaction {
	
	
	public static void main(String[]  args) throws IOException{
		 ATMTransaction atmtrans = new ATMTransaction();
		
		atmtrans.getLogin();
	}

}