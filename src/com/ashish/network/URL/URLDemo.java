package com.ashish.network.URL;

import java.net.URL;

public class URLDemo {
	public static void main(String[] args) {

		try {
			
			URL url = new URL("https://www.facebook.com/ashishkgrich");

			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());
			System.out.println("default port: " + url.getDefaultPort() );
			System.out.println("Content: " + url.getContent());
			//System.out.println(url.get);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}