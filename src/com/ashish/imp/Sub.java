package com.ashish.imp;

class Parent{
	protected int parent;
	
	Parent(){
		//System.out.println("Pi");
		this.showDetails();
	}
	protected void showDetails(){
		System.out.println("Parent Class");
	}
}

public class Sub extends Parent implements VersionId {
	
	/*@Override*/
	public void getVersion() {
		System.out.println("Version is 1.1");;
	}
	
	Sub(){
	super();	
	System.out.println("hi");
	}
	
	@Override
	public void showDetails(){
		System.out.println("Sub Class");
	}
	public static void main(String[] args) {
		
		Parent obj1 = new Sub();
		obj1.showDetails();
		/*obj1.getVersion();*/    // Failed. Compile time reference type is checked. Run Time Object type is checked...
		
		Sub obj2 = new Sub();
		obj2.getVersion();
		obj2.showDetails();
		
		new Parent().showDetails();
	}
}
