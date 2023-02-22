package org.computer;

public class Desktop extends Computer {
	//Method Creation
	public void dsktopSize() {
		System.out.println("Desktop Size is 13Inches");

	}
	//Main Method
	public static void main(String[] args) {
		Desktop Ds = new Desktop();
		Ds.dsktopSize();
		Ds.compModel();
		
	}

}
