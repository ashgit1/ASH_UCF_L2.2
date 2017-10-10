package com.ashish.network.URLConnection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpURLConnectionDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.tutorialspoint.com/");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			//System.out.println("Content Type: " + huc.getContentType());
			
			Map<String, List<String>> hfmap = huc.getHeaderFields();
			System.out.println("zie of headrefield map: " + hfmap.size());
			
			Set<Entry<String, List<String>>> set = hfmap.entrySet();
			Iterator<Entry<String, List<String>>> iterator = set.iterator();
			while(iterator.hasNext()){
				Entry<String, List<String>> item = iterator.next();
				System.out.print(item.getKey() + ": "); System.out.println(item.getValue());
			}
			
			/*System.out.println("------------------------------------------------------");
			for (int i = 1; i <= 9; i++) {
				System.out.println("#" + i + ": " + huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}*/
			
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}