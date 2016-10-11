package com.ashish.enums;

public class EnumDefaultValues {

	enum CountryCode {
		India(901), Spain(456), Italy(789);
		int countrycode;

		private CountryCode(int code) {
			this.countrycode = code;
		}
	};

	public static void main(String[] args) {
		
		for(CountryCode cc : CountryCode.values()){
			System.out.println("Country: " + cc + ", cc: " + cc.countrycode);
		}
		
	}

}
