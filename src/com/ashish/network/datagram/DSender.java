package com.ashish.network.datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class DSender {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		
		ArrayList<String> list = new ArrayList<>(); 
		for(int i=0 ; i<100; i++){
			list.add("item"+i);
		}
		
		InetAddress ip = InetAddress.getByName("127.0.0.1");

		DatagramPacket dp = new DatagramPacket(list.toString().getBytes(), list.toString().length(), ip, 3000);
		ds.send(dp);
		ds.close();
		
	}
}