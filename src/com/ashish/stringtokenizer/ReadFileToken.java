package com.ashish.stringtokenizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFileToken {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String line;
			br = new BufferedReader(new FileReader("D:/ashish/Users/Tutorials/UCF/UcfWorkSpace/Ucf_L2.2_Core/src/tokens.csv"));
			//br = new BufferedReader(new FileReader("/src/tokens.csv"));
			while ((line = br.readLine()) != null) {
				
				System.out.println(line);

				StringTokenizer stringTokenizer = new StringTokenizer(line, "|");

				while (stringTokenizer.hasMoreElements()) {

					int id = Integer.parseInt(stringTokenizer.nextElement()
							.toString());
					double price = Double.parseDouble(stringTokenizer
							.nextElement().toString());
					String username = stringTokenizer.nextElement().toString();

					StringBuilder sb = new StringBuilder();
					sb.append("\nId : " + id);
					sb.append("\nPrice : " + price);
					sb.append("\nUsername : " + username);
					sb.append("\n*******************\n");

					System.out.println(sb.toString());
				}
			}

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}