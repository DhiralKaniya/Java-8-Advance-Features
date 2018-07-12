package com.session.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestTryCatch {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("mail id.txt"))){
			String str = new String();
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
