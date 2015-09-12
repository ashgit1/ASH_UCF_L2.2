package com.ashish.annotation;

import java.lang.reflect.Method;

class Player {
	@PlayerAnnotation(age=25, name="Ashishkumar Gupta")
	public void getPlayer(){
	}
}

public class TestAnnotation{
	public static void main(String args[]) throws Exception{
		Player p = new Player();
		Method m = p.getClass().getMethod("getPlayer");
		PlayerAnnotation getPlayer = m.getAnnotation(PlayerAnnotation.class);
		System.out.println("======== Player details =========");
		System.out.println( getPlayer.age() + "\n" + getPlayer.name());
	}
}