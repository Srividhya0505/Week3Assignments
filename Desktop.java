package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("27 inch BenQ Monitor");
		
	}

	public static void main(String[] args) {
	
		Desktop mydesktop = new Desktop ();
		//calling from same class 
		mydesktop.desktopSize();
		 
		//calling from Parent
		mydesktop.computerModel();
	}

}
