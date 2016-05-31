package com.ashish.string;

public class ToString {
	
	private String name;
	private String country;
	
	public ToString(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public static void main(String[] args) {
		ToString obj = new ToString("Ashish", "India");
		System.out.println(obj.toString());
		System.out.println(new ToString("Tanya", "Ukraine").toString());
	}
	
	@Override
	public String toString(){
		return name + ":" + country;
	}

}
