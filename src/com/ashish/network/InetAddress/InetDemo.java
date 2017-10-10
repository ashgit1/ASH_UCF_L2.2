package com.ashish.network.InetAddress;

import java.net.InetAddress;

public class InetDemo {
	public static void main(String[] args) {
		try {
			
			InetAddress ip = InetAddress.getByName("www.javatpoint.com");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
			System.out.println("---------------------------------------");	
			
			InetAddress localip = InetAddress.getLocalHost();
			System.out.println("Host Name: " + localip.getHostName());
			System.out.println("IP Address: " + localip.getHostAddress());
			System.out.println("---------------------------------------");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}